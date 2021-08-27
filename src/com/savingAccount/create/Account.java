package com.savingAccount.create;

public class Account{

	String name,accountNumber,branchNumber;
	Float deposit;
	public Account(String name, String accountNumber, String branchNumber, Float deposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.branchNumber = branchNumber;
		this.deposit = deposit;
		
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranchNumber() {
		return branchNumber;
	}
	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}
	public Float getDeposit() {
		return deposit;
	}
	public void setDeposit(Float deposit) {
		this.deposit = deposit;
	}
	
}
