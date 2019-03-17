package model;

public class User {
	String tcID;
	String name;
	String surname;
	double amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
