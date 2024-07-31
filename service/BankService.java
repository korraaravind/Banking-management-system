package com.qsp.Banking_Managment_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.BankDao;
import com.qsp.Banking_Managment_system.dto.Bank;
import com.qsp.Banking_Managment_system.dto.Branchs;
import com.qsp.Banking_Managment_system.dto.Owner;

@Service
public class BankService {

	@Autowired
	BankDao bankDao;

	public Bank inserBank(Bank bank) {
		return bankDao.inserBank(bank);
	}

	public Bank fetchBankById(int bankId) {
		return bankDao.fetchBankById(bankId);
	}

	public Bank deleteByBankId(int bankid) {
		return bankDao.deleteByBankId(bankid);
	}

	public Bank addExistingBranchToExistingBank(int branchId, int bankId) {
		return bankDao.addExistingBranchToExistingBank(branchId, bankId);
	}

	public Bank addNewBranchToExistingBank(Branchs newBranch, int bankId) {

		return bankDao.addNewBranchToExistingBank(newBranch, bankId);
	}
	
	 public Optional<Bank> findingByBankName(@Param("bankName") String bankName){
			return bankDao.findingByBankName(bankName);
		}
}
