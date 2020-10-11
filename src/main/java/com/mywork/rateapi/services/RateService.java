package com.mywork.rateapi.services;

import java.util.List;

import com.mywork.rateapi.model.ExchangeRate;

public interface RateService {
	
	public ExchangeRate getRate(List<String> ccys);
	public ExchangeRate getRate(List<String> ccys, String Date);
	public List<ExchangeRate> getHistoricalRate(List<String> ccys);

}
