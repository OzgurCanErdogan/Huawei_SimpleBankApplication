package model;

import java.util.*;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Currency {
    private Map<String, Double> rates;
    private String date;
    private String[] rateBase;
    private double[] rateRate;
    private String base;
    
    
    public String[] getRateBase() {
		return rateBase;
	}
	public void setRateBase(String[] rateBase) {
		this.rateBase = rateBase;
	}
	public double[] getRateRate() {
		return rateRate;
	}
	public void setRateRate(double[] rateRate) {
		this.rateRate = rateRate;
	}
	
    

    @JsonProperty("rates")
    public Map<String, Double> getRates() { return rates; }
    @JsonProperty("rates")
    public void setRates(Map<String, Double> value) { this.rates = value; }

    @JsonProperty("date")
    public String getDate() { return date; }
    /*
    public Exchange[] getMoneyType() {
		return moneyType;
	}
	public void setMoneyType(Exchange[] moneyType) {
		this.moneyType = moneyType;
	}
	*/
	@JsonProperty("date")
    public void setDate(String value) { this.date = value; }

    @JsonProperty("base")
    public String getBase() { return base; }
    @JsonProperty("base")
    public void setBase(String value) { this.base = value; }
    
    
}

