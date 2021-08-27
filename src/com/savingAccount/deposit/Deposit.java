package com.savingAccount.deposit;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.bankTransactionHistory.TransactionHistory;
import com.savingAccount.create.CreatedAccounts;

public class Deposit {
	
	Float newBalance;
	
	CreatedAccounts account = new CreatedAccounts();
	
	public Deposit() {
		
		deposit_update(account.getAccountNumber(),account.getInitialAmount(),100000F);
	}
	
	public void deposit_update(String accountNumber, Float currBalance, Float depositAmnt) {
		newBalance = currBalance + depositAmnt;
		
		//binding new values to account
		account.setAccountNumber(accountNumber);
		account.setInitialAmount(newBalance);
		
		//saving to list
	    List<CreatedAccounts> accUpdated = new ArrayList<>();
	    accUpdated.add(account);
	    System.out.println("Account balance is now " +newBalance);
	    
	    List<TransactionHistory> history = new ArrayList<>();
		TransactionHistory transHist = new TransactionHistory();
		LocalTime localTime = LocalTime.now();
		
		//binding history values
		transHist.setActivity("Deposited into account :" +accountNumber);
		transHist.setAmmount(newBalance);
		transHist.setLocalTime(localTime);
		
		//saving
		history.add(transHist);
	}

}
