package model;

import java.util.Hashtable;
import java.util.Map;
import java.util.ArrayList;

public class User {
	String tcID;
	String name;
	String surname;
	//double amount;
	String password;
	
	Hashtable<String,Double> currencyAmount = new Hashtable<String,Double>();
	
	ArrayList<Transaction> history = new ArrayList<Transaction>();
	
	
	public void addCurrency(String base, double amount) {
		if(currencyAmount.containsKey(base)) {
			if(currencyAmount.get(base) >= 0.0) {
				currencyAmount.put(base, currencyAmount.get(base) + amount);
			}
			else {
				currencyAmount.put(base, amount);
			}
		}
		else {
			currencyAmount.put(base, amount);
		}	
	}
	
	
	public Hashtable<String, Double> getCurrencyAmount() {
		return currencyAmount;
	}
	public void setCurrencyAmount(Hashtable<String, Double> currencyAmount) {
		this.currencyAmount = currencyAmount;
	}
	public ArrayList<Transaction> getHistory() {
		return history;
	}
	public void setHistory(ArrayList<Transaction> history) {
		this.history = history;
	}
	//Transaction history[];
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTcID() {
		return tcID;
	}
	public void setTcID(String tcID) {
		this.tcID = tcID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
