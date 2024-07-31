package com.qsp.Banking_Managment_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.customerDao;
import com.qsp.Banking_Managment_system.dto.Accounts;
import com.qsp.Banking_Managment_system.dto.Customers;

@Service
public class CustomerService {
	@Autowired
	customerDao customerDao;
	
	public Customers saveCustomer (Customers customers) {
		return customerDao.saveCustomer(customers);
	}
	
	public Customers fetchByCustomerId (int customerId) {
		return customerDao.fetchByCustomerId(customerId);
	}
	
	public Customers addExistingCustomerToNewAccount (int customerId, Accounts newAccount ) {
		return customerDao.addExistingCustomerToNewAccount(customerId, newAccount);
	}
	
	public List<Customers> fetchAllCustomerAndAccounts(){
		return customerDao.fetchAllCustomerAndAccounts();
	}



}
