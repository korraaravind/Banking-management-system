package com.qsp.Banking_Managment_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Branchs;
import com.qsp.Banking_Managment_system.dto.Customers;
import com.qsp.Banking_Managment_system.repo.BranchesRepo;
import com.qsp.Banking_Managment_system.repo.CustomersRepo;

@Repository
public class BranchesDao {

	@Autowired
	BranchesRepo branchesRepo;
	customerDao customerDao;
	CustomersRepo customersRepo;

	public Branchs savebraches(Branchs branchs) {
		return branchesRepo.save(branchs);
	}

	public Branchs fetchBranchById(int branchId) {
		return branchesRepo.findById(branchId).get();
	}

	public List<Branchs> fetchAll() {
		return branchesRepo.findAll();
	}
	
	
	
	public Branchs addExestingBranchandAddExestindCustomer (int branchId, int customerId) {
		Branchs branchs = fetchBranchById(branchId);
		Customers customers = customerDao.fetchByCustomerId(customerId);
		List<Customers> list=branchs.getCustomers();
		list.add(customers);
		branchs.setCustomers(list);
		return savebraches(branchs);
		
		
	}

}
