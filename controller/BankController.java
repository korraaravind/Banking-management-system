package com.qsp.Banking_Managment_system.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dto.Bank;
import com.qsp.Banking_Managment_system.dto.Branchs;
import com.qsp.Banking_Managment_system.dto.Owner;
import com.qsp.Banking_Managment_system.service.BankService;

@RestController
public class BankController {

	@Autowired
	
	BankService bankService;
	
	
	@PostMapping("/inserBank")
	public Bank inserBank(@RequestBody Bank bank) {
		return bankService.inserBank(bank);
	}
	
	@GetMapping("/fetchBankById")
	public Bank fetchBankById(@RequestParam int bankId) {
		return bankService.fetchBankById(bankId);
	}
	
	@GetMapping("/deleteByBankId")
	public Bank deleteByBankId(@RequestParam int bankid) {
		return bankService.deleteByBankId(bankid);
	}
	
	@GetMapping("/addExistingBranchToExistingBank")
	public Bank addExistingBranchToExistingBank(@RequestParam int branchId, @RequestParam int bankId) {
		return bankService.addExistingBranchToExistingBank(branchId, bankId);
			
	}
	
	@GetMapping("/addNewBranchToExistingBank")
	
	public Bank addNewBranchToExistingBank(@RequestBody Branchs newBranch, @RequestParam int bankId) {

		return bankService.addNewBranchToExistingBank(newBranch, bankId);
	}
	
	@GetMapping("/findingByBankName")
	Optional<Bank> findingByBankName(@RequestParam("bankName") String bankName){
		return bankService.findingByBankName(bankName);
	}
	
}
