package com.currentAccount.create;

public class Account {
	String accountNumber;
	float balance;
	float overdraft;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNumber, float balance,float overdraft) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.overdraft = overdraft;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(float overdraft) {
		this.overdraft = overdraft;
	}
	
	

}
