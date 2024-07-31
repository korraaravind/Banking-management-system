package com.qsp.Banking_Managment_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Accounts;
import com.qsp.Banking_Managment_system.repo.AccountRepo;

@Repository
public class AccountsDao {
	
	@Autowired
	
	AccountRepo accountRepo;
	
	public Accounts saveAccounts (Accounts accounts) {
		return accountRepo.save(accounts);
	}
	public Accounts fetchById (int accountId) {
		return accountRepo.findById(accountId).get();
	}

}
