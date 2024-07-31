package com.qsp.Banking_Managment_system.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Bank;
import com.qsp.Banking_Managment_system.dto.Branchs;
import com.qsp.Banking_Managment_system.dto.Owner;
import com.qsp.Banking_Managment_system.repo.BankRepo;
import com.qsp.Banking_Managment_system.repo.OwnerRepo;

@Repository
public class BankDao {
	@Autowired
	BankRepo bankRepo;
	BranchesDao branchesDao;

	
	public Bank inserBank(Bank bank) {
		return bankRepo.save(bank);
	}
	
	public Bank fetchBankById(int bankId) {
		return bankRepo.findById(bankId).get();
	}
	
	public Bank deleteByBankId(int bankid) {
		Bank bank = fetchBankById(bankid);
		bankRepo.deleteById(bankid);
		return bank;
	}
	
	public Bank addExistingBranchToExistingBank(int branchId, int bankId) {
		
		Bank bank=fetchBankById(bankId);
		Branchs branchs =branchesDao.fetchBranchById(branchId);
		List<Branchs> list = bank.getBranchs();
		list.add(branchs);
		bank.setBranchs(list);
		return bank;
		
	}
	
	public Bank addNewBranchToExistingBank(Branchs newBranch, int bankId) {
		Bank bank =fetchBankById(bankId);
		List<Branchs> list = bank.getBranchs();
		list.add(newBranch);
		bank.setBranchs(list);
		return inserBank(bank);
	}
	
//	User Method
	 public Optional<Bank> findingByBankName(@Param("bankName") String bankName){
		return bankRepo.findingByBankName(bankName);
	}
	
	
	
	
	
	
	

}
