package com.qsp.Banking_Managment_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dto.Accounts;
import com.qsp.Banking_Managment_system.dto.Customers;
import com.qsp.Banking_Managment_system.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/saveCustomer")
	public Customers saveCustomer(@RequestBody Customers customers) {
		return customerService.saveCustomer(customers);
	}

	@GetMapping("/fetchByCustomerId")
	public Customers fetchByCustomerId(@RequestParam int customerId) {
		return customerService.fetchByCustomerId(customerId);
	}
	@GetMapping("/addExistingCustomerToNewAccount")
	public Customers addExistingCustomerToNewAccount (@RequestParam int customerId, @RequestBody Accounts newAccount ) {
		return customerService.addExistingCustomerToNewAccount(customerId, newAccount);
	}
	
	@GetMapping("/fetchAllCustomerAndAccounts")
	public List<Customers> fetchAllCustomerAndAccounts(){
		return customerService.fetchAllCustomerAndAccounts();
	}

}
