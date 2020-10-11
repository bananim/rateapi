package com.mywork.rateapi.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mywork.rateapi.model.ExchangeRate;
import com.mywork.rateapi.model.RateDetails;
import com.mywork.rateapi.services.RateService;

@RestController
@RequestMapping("/exchange")
public class RateApiResource {

	@Autowired
	RateService rateService;

	@RequestMapping("/rates")
	public String getLatestRate(@RequestParam(value = "ccy") String[] currencyString, Model model) {
		ExchangeRate exRate = rateService.getRate(Arrays.asList(currencyString));
		List<RateDetails> rateDetails = exchangeRatetoRateDetails(exRate);
		model.addAttribute("rateDetails", rateDetails);
		model.addAttribute("exRate", exRate);
		return "rates";
	}

	private List<RateDetails> exchangeRatetoRateDetails(ExchangeRate exRate) {
		List<RateDetails> rateDetailsList = new ArrayList<>();
		exRate.getRates().forEach((String k, Double v) -> {
			RateDetails rd = new RateDetails(k, v + "", exRate.getDate());
			rateDetailsList.add(rd);
		});
		return rateDetailsList;
	}

	@RequestMapping("/pastrates")
	public List<ExchangeRate> getPastExchangeRate(@RequestParam(value = "ccy") String[] currencyString) {
		List<ExchangeRate> exRateList = rateService.getHistoricalRate(Arrays.asList(currencyString));
		return exRateList;
	}
	
}
