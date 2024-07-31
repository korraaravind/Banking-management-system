package com.qsp.Banking_Managment_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.CustomerHelpLine;
import com.qsp.Banking_Managment_system.repo.CustomerHelpRepo;


@Repository
public class Customer_Help_LineDao {
	
	@Autowired
	CustomerHelpRepo customerHelpRepo;
	
	public CustomerHelpLine saveCustomerHelpDetails (CustomerHelpLine customerHelpLine) {
		return customerHelpRepo.save(customerHelpLine);
	}
	
	public CustomerHelpLine fetchByHelpId (int helpId) {
		return customerHelpRepo.findById(helpId).get();
	}

}
