package com.qsp.Banking_Managment_system.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankId;
	private String bankName;
	private String bankHeadQuarters;
	private String establetionYear;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Branchs> branchs;
	
	public String getEstabletionYear() {
		return establetionYear;
	}
	public void setEstabletionYear(String establetionYear) {
		this.establetionYear = establetionYear;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankHeadQuarters() {
		return bankHeadQuarters;
	}
	public void setBankHeadQuarters(String bankHeadQuarters) {
		this.bankHeadQuarters = bankHeadQuarters;
	}
	public List<Branchs> getBranchs() {
		return branchs;
	}
	public void setBranchs(List<Branchs> branchs) {
		this.branchs = branchs;
	}
	
	

}
