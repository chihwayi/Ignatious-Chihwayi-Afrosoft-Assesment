package com.savingAccount.create;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.bankTransactionHistory.TransactionHistory;


public class OpenAccount {

	Account account;
	Float amount;
	//public Map<String, Float> accountCreates;
	CreatedAccounts created = new CreatedAccounts();

	public OpenAccount() {
		account = new Account();
		AccountOpenValidation(account.accountNumber, account.deposit);
	}

	public void AccountOpenValidation(String accountNumber, Float ammount) {
		if (amount <= 1000) {
			
			//saving to list of accounts created
			created.setAccountNumber(accountNumber);
			created.setInitialAmount(ammount);
			
			List<CreatedAccounts> dos = new ArrayList<>();
			dos.add(created);
			
			//saving to transaction history
			
			List<TransactionHistory> history = new ArrayList<>();
			TransactionHistory transHist = new TransactionHistory();
			LocalTime localTime = LocalTime.now();
			
			//binding history values
			transHist.setActivity("Created account :" +accountNumber);
			transHist.setAmmount(ammount);
			transHist.setLocalTime(localTime);
			
			//saving
			history.add(transHist);
			
			System.out.println("Account for number has been created" );
		}

		else {
			System.out.println("Account creation minimum balance should be ZWL1000");
		}
	}

}
