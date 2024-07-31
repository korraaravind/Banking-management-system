package com.qsp.Banking_Managment_system.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private int customerAge;
	private long customerPhn;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Accounts> accounts;
	
	private String customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public long getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(long customerPhn) {
		this.customerPhn = customerPhn;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public List<Accounts> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	
	

}
