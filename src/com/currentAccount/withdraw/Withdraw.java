package com.currentAccount.withdraw;

import com.currentAccount.create.*;

import java.util.ArrayList;
import java.util.List;

public class Withdraw {
	
	List<Account> accountLists = new ArrayList<>();
	
	public void overdraft_facility() {
		/// Time up, i could not finish
		
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
