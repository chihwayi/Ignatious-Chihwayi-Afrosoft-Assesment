package com.savingAccount.create;

public class CreatedAccounts {
	
	Float initialAmount;
	String accountNumber;
	
	
	public CreatedAccounts() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CreatedAccounts(Float initialAmount, String accountNumber) {
		super();
		this.initialAmount = initialAmount;
		this.accountNumber = accountNumber;
	}



	public Float getInitialAmount() {
		return initialAmount;
	}



	public void setInitialAmount(Float initialAmount) {
		this.initialAmount = initialAmount;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	

}
