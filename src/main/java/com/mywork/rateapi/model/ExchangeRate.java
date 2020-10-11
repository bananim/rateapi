package com.mywork.rateapi.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeRate {
	@JsonProperty
	private String base;
	@JsonProperty
	private Map<String, Double> rates;
	@JsonProperty
	private String date;
	
	public ExchangeRate() {
		
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Map<String, Double> getRates() {
		return rates;
	}

	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
