package com.qsp.Banking_Managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dto.BankLoans;
import com.qsp.Banking_Managment_system.service.Bank_LoanService;

@RestController
public class Bank_LoanController {
	
	@Autowired
	Bank_LoanService bank_LoanService;
	
	@PostMapping("/saveBankLoan")
	public BankLoans saveBankLoan (@RequestBody BankLoans bankLoans) {
		return bank_LoanService.saveBankLoan(bankLoans);
	}
	
	@GetMapping("/fetchByLoanId")
	public BankLoans fetchByLoanId (@RequestParam int loanId) {
		return bank_LoanService.fetchByLoanId(loanId);
	}

}
