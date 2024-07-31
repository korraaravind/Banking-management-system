package com.qsp.Banking_Managment_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dto.Branchs;
import com.qsp.Banking_Managment_system.service.BrancheService;

@RestController
public class BrancheController {

	@Autowired
	BrancheService brancheService;

	@PostMapping("/savebraches")
	public Branchs savebraches(@RequestBody Branchs branchs) {
		return brancheService.savebraches(branchs);
	}

	@GetMapping("/fetchBranchById")
	public Branchs fetchBranchById(@RequestParam int branchId) {
		return brancheService.fetchBranchById(branchId);
	}

	@GetMapping("/fetchAll")
	public List<Branchs> fetchAll() {
		return brancheService.fetchAll();
	}
	
	@GetMapping("/addExestingBranchandAddExestindCustomer")
	public Branchs addExestingBranchandAddExestindCustomer (@RequestParam int branchId, int customerId) {
		return brancheService.addExestingBranchandAddExestindCustomer(branchId, customerId);
	}
}
