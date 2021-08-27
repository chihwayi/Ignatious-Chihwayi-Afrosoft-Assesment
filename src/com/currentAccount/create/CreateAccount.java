package com.currentAccount.create;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.bankTransactionHistory.TransactionHistory;
import com.savingAccount.create.CreatedAccounts;

public class CreateAccount {

	//getting saving account values
	CreatedAccounts savingAccData = new CreatedAccounts();
	
	public CreateAccount() {
		//creating new current account
		Account accountData = new Account();
		List<Account> currAccounts = new ArrayList<>();
		
		accountData.setAccountNumber(savingAccData.getAccountNumber());
		accountData.setBalance(savingAccData.getInitialAmount());
		accountData.setOverdraft(0);
		
		//Saving Acount
		currAccounts.add(accountData);
		
		List<TransactionHistory> history = new ArrayList<>();
		TransactionHistory transHist = new TransactionHistory();
		LocalTime localTime = LocalTime.now();
		
		//binding history values
		transHist.setActivity("Created new Current account :" +savingAccData.getAccountNumber());
		transHist.setAmmount(savingAccData.getInitialAmount());
		transHist.setLocalTime(localTime);
		
		//saving
		history.add(transHist);
		
	}
}
