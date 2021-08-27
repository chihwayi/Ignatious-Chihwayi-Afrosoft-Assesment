package com.savingAccount.withdraw;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.bankTransactionHistory.TransactionHistory;
import com.savingAccount.create.CreatedAccounts;

public class Withdraw {
	
	Float currentBalance;
	Float newBalance;
	String accountNumber;
	CreatedAccounts accounts = new CreatedAccounts();
	List<CreatedAccounts> accountLists = new ArrayList<>();
	
	public Withdraw() {
		//withdraw_check();
	}
	
	public void withdraw_check(String acountNumber, Float currbalance, Float withdrawamout) {
		//Invoking Account search Method
		List<String> listSearched = account_validity_check(acountNumber);
		
		for (String string : listSearched) {
            if(string.matches(acountNumber)){
                if(currbalance >= 1000) {
                	
                	currbalance = currbalance - withdrawamout;
                	
                	//binding new balances
                	accounts.setAccountNumber(acountNumber);
                	accounts.setInitialAmount(currbalance);
                	
                	//saving new balances
                	accountLists.add(accounts);
                	
                	//saving to transaction history
        			
        			List<TransactionHistory> history = new ArrayList<>();
        			TransactionHistory transHist = new TransactionHistory();
        			LocalTime localTime = LocalTime.now();
        			
        			//binding history values
        			transHist.setActivity("Withdrew account :" +accountNumber);
        			transHist.setAmmount(currbalance);
        			transHist.setLocalTime(localTime);
        			
        			//saving
        			history.add(transHist);
                }
                
                else {
                	System.out.println("Account balance is less than ZWL1000");
                }
            }
            
            else {
            	System.out.println("No such account in System");
            }
		}
		
		
	}
	
	//Searching an Account
	public List<String> account_validity_check(String accountNumber) {
		List<String> foundAcc = new ArrayList<>();
		accountLists.stream()
		.filter(search -> search.getAccountNumber() != null)
		.forEach(
				search -> {
					String accnum = search.getAccountNumber();
					if(accnum.equalsIgnoreCase(accountNumber)) {
						foundAcc.add(accountNumber);
					}
				}
				
				
				
				);
		return foundAcc;
	}

}
