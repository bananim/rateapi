package com.mywork.rateapi.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mywork.rateapi.model.ExchangeRate;

@Service
public class RateServiceImpl implements RateService {

	@Override
	public ExchangeRate getRate(List<String> ccys) {
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		String url = "https://api.ratesapi.io/api/latest?symbols=";
		ExchangeRate exRate = restTemplate.getForObject(url + StringUtils.join(ccys, ','), ExchangeRate.class);
		return exRate;
	}

	@Override
	public ExchangeRate getRate(List<String> ccys, String date) {
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		String url = String.format("https://api.ratesapi.io/api/%s?symbols=", date);
		ExchangeRate exRate = restTemplate.getForObject(url + StringUtils.join(ccys, ','), ExchangeRate.class);
		return exRate;
	}

	@Override
	public List<ExchangeRate> getHistoricalRate(List<String> ccys) {
		List<ExchangeRate> exRateList = new ArrayList<ExchangeRate>();
		LocalDate now = LocalDate.now(); 
		for(int i=1; i<=6; i++) {
			LocalDate earlier = now.minusMonths(1);
			ExchangeRate exRate = this.getRate(ccys, earlier.toString());
			exRateList.add(exRate);
			now = earlier;
		}
		return exRateList;
	}

}
