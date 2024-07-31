package com.qsp.Banking_Managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.Bank_LoanDao;
import com.qsp.Banking_Managment_system.dto.BankLoans;

@Service
public class Bank_LoanService {
	
	@Autowired
	
	Bank_LoanDao bank_LoanDao;
	
	public BankLoans saveBankLoan (BankLoans bankLoans) {
		return bank_LoanDao.saveBankLoan(bankLoans);
	}
	
	public BankLoans fetchByLoanId (int loanId) {
		return bank_LoanDao.fetchByLoanId(loanId);
	}

}
