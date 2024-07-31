package com.qsp.Banking_Managment_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.BranchesDao;
import com.qsp.Banking_Managment_system.dto.Branchs;

@Service
public class BrancheService {

	@Autowired
	BranchesDao branchesDao;

	public Branchs savebraches(Branchs branchs) {
		return branchesDao.savebraches(branchs);
	}

	public Branchs fetchBranchById(int branchId) {
		return branchesDao.fetchBranchById(branchId);
	}

	public List<Branchs> fetchAll(){
		return branchesDao.fetchAll();
	}

	public Branchs addExestingBranchandAddExestindCustomer (int branchId, int customerId) {
		return branchesDao.addExestingBranchandAddExestindCustomer(branchId, customerId);
	}

}
