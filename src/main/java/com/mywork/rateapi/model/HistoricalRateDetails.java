package com.mywork.rateapi.model;

import java.util.List;
import java.util.Map;

public class HistoricalRateDetails {
	Map<String, List<RateDetails>> currencyRateMap;
	
	public Map<String, List<RateDetails>> getCurrencyRateMap() {
		return currencyRateMap;
	}

	public void setCurrencyRateMap(Map<String, List<RateDetails>> currencyRateMap) {
		this.currencyRateMap = currencyRateMap;
	}
}
