package com.qsp.Banking_Managment_system.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Branchs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int banchId;
	private String branchname;
	private String brancgIFC;
	private long branchPhone;
	private String branchEmailId;
	private String address;
	private int pinCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Customers> customers;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getBanchId() {
		return banchId;
	}
	public void setBanchId(int banchId) {
		this.banchId = banchId;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getBrancgIFC() {
		return brancgIFC;
	}
	public void setBrancgIFC(String brancgIFC) {
		this.brancgIFC = brancgIFC;
	}
	public long getBranchPhone() {
		return branchPhone;
	}
	public void setBranchPhone(long branchPhone) {
		this.branchPhone = branchPhone;
	}
	public String getBranchEmailId() {
		return branchEmailId;
	}
	public void setBranchEmailId(String branchEmailId) {
		this.branchEmailId = branchEmailId;
	}
	public List<Customers> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
	
	
	

}
