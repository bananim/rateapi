package com.mywork.rateapi.model;

import java.util.List;
import java.util.Map;

public class HistoricalRateDetails {
	Map<String, List<Double>> currencyRateMap;
	String date;

	public Map<String, List<Double>> getCurrencyRateMap() {
		return currencyRateMap;
	}

	public void setCurrencyRateMap(Map<String, List<Double>> currencyRateMap) {
		this.currencyRateMap = currencyRateMap;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
