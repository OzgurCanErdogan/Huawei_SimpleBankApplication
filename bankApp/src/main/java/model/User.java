package model;

import java.util.Hashtable;
import java.util.ArrayList;

public class User {
	String tcID;
	String name;
	String surname;
	//double amount;
	private String password;
	Hashtable<String,Double> currencyAmount;
	//Transaction history[];
	ArrayList<Transaction> history = new ArrayList<Transaction>();
	
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
