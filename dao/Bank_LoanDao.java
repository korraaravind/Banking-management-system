package com.qsp.Banking_Managment_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.BankLoans;
import com.qsp.Banking_Managment_system.repo.BankLoanRepo;

@Repository
public class Bank_LoanDao {

	@Autowired
	BankLoanRepo bankLoanRepo;
	
	public BankLoans saveBankLoan (BankLoans bankLoans) {
		return bankLoanRepo.save(bankLoans);
	}
	
	public BankLoans fetchByLoanId (int loanId) {
		return bankLoanRepo.findById(loanId).get();
	}
}
