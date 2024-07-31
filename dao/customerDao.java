package com.qsp.Banking_Managment_system.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Accounts;
import com.qsp.Banking_Managment_system.dto.Customers;
import com.qsp.Banking_Managment_system.repo.CustomersRepo;

@Repository
public class customerDao {
	@Autowired
	CustomersRepo customersRepo;
	AccountsDao accountsDao;
	
	public Customers saveCustomer (Customers customers) {
		return customersRepo.save(customers);
	}
	public Customers fetchByCustomerId (int customerId) {
		return customersRepo.findById(customerId).get();
	}
	
	public Customers addExistingCustomerToNewAccount (int customerId, Accounts newAccount ) {
		Customers customers=fetchByCustomerId(customerId);
		List<Accounts> list=customers.getAccounts();
		list.add(newAccount);
		customers.setAccounts(list);
		return saveCustomer(customers);
	}
	
	public List<Customers> fetchAllCustomerAndAccounts(){
		return customersRepo.findAll();
	}
	
//	public Customers addExistingCustomerAndAddExistingAccount (int customerId, int accountId) {
//		Customers customers=fetchByCustomerId(customerId);
//		Accounts accounts=accountsDao.fetchById(accountId);
//		List<Accounts> list=customers.getAccounts();
//		list.add(accounts);
//		return saveCustomer(customers);
//		
//	}

}
