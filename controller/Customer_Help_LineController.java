package com.qsp.Banking_Managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dao.Customer_Help_LineDao;
import com.qsp.Banking_Managment_system.dto.CustomerHelpLine;
import com.qsp.Banking_Managment_system.service.Customer_help_lineService;

@RestController
public class Customer_Help_LineController {
	
	@Autowired
	Customer_help_lineService customer_help_lineService;
	
	@PostMapping("/saveCustomerHelpDetails")
	public CustomerHelpLine saveCustomerHelpDetails (@RequestBody CustomerHelpLine customerHelpLine) {
		return customer_help_lineService.saveCustomerHelpDetails(customerHelpLine);
	}
	
	@GetMapping("/fetchByHelpId")
	public CustomerHelpLine fetchByHelpId (@RequestParam int helpId) {
		return customer_help_lineService.fetchByHelpId(helpId);
	}

}
