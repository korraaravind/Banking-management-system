package com.qsp.Banking_Managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.Customer_Help_LineDao;
import com.qsp.Banking_Managment_system.dto.CustomerHelpLine;
import com.qsp.Banking_Managment_system.repo.CustomerHelpRepo;

@Service
public class Customer_help_lineService {
	
	@Autowired
	Customer_Help_LineDao customer_Help_LineDao;
	
	public CustomerHelpLine saveCustomerHelpDetails (CustomerHelpLine customerHelpLine) {
		return customer_Help_LineDao.saveCustomerHelpDetails(customerHelpLine);
	}
	
	public CustomerHelpLine fetchByHelpId (int helpId) {
		return customer_Help_LineDao.fetchByHelpId(helpId);
	}

}
