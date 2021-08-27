package com.bankTransactionHistory;

import java.time.LocalTime;

public class TransactionHistory {
	String activity;
	float ammount;
	LocalTime date;
	
	
	public TransactionHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TransactionHistory(String activity, float ammount, LocalTime date) {
		super();
		this.activity = activity;
		this.ammount = ammount;
		this.date = date;
	}



	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public float getAmmount() {
		return ammount;
	}
	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}
	public LocalTime getLocalTime() {
		return date;
	}
	public void setLocalTime(LocalTime date) {
		this.date = date;
	}
	
	

}
