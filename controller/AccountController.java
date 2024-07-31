package com.qsp.Banking_Managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dto.Accounts;
import com.qsp.Banking_Managment_system.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/saveAccounts")
	public Accounts saveAccounts (@RequestBody Accounts accounts) {
		return accountService.saveAccounts(accounts);
	}
	@GetMapping("/fetchById")
	public Accounts fetchById (@RequestParam int accountId) {
		return accountService.fetchById(accountId);
	}


}
