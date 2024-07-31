package com.qsp.Banking_Managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.AccountsDao;
import com.qsp.Banking_Managment_system.dto.Accounts;

@Service
public class AccountService {
	@Autowired
	AccountsDao accountsDao;
	
	public Accounts saveAccounts (Accounts accounts) {
		return accountsDao.saveAccounts(accounts);
	}
	public Accounts fetchById (int accountId) {
		return accountsDao.fetchById(accountId);
	}

}
