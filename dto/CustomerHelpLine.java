package com.qsp.Banking_Managment_system.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerHelpLine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerHelpId;
	private String customerHelpName;
	private long customerHelpNumber;
	private String customerHelpService;
	public int getCustomerHelpId() {
		return customerHelpId;
	}
	public void setCustomerHelpId(int customerHelpId) {
		this.customerHelpId = customerHelpId;
	}
	public String getCustomerHelpName() {
		return customerHelpName;
	}
	public void setCustomerHelpName(String customerHelpName) {
		this.customerHelpName = customerHelpName;
	}
	public long getCustomerHelpNumber() {
		return customerHelpNumber;
	}
	public void setCustomerHelpNumber(long customerHelpNumber) {
		this.customerHelpNumber = customerHelpNumber;
	}
	public String getCustomerHelpService() {
		return customerHelpService;
	}
	public void setCustomerHelpService(String customerHelpService) {
		this.customerHelpService = customerHelpService;
	}
	
	
}
