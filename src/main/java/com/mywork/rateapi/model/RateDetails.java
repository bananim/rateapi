package com.mywork.rateapi.model;

public class RateDetails {
	String currency;
	String rate;
	String date;

	
	public RateDetails(String currency, String rate, String date) {
		super();
		this.currency = currency;
		this.rate = rate;
		this.date = date;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
