package com.qsp.Banking_Managment_system.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private String accountBankName;
	private String accountHodlerName;
	private long accountNumbber;
	private String accountHolderAdd;
	private long accountHolderPhn;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountBankName() {
		return accountBankName;
	}
	public void setAccountBankName(String accountBankName) {
		this.accountBankName = accountBankName;
	}
	public String getAccountHodlerName() {
		return accountHodlerName;
	}
	public void setAccountHodlerName(String accountHodlerName) {
		this.accountHodlerName = accountHodlerName;
	}
	public long getAccountNumbber() {
		return accountNumbber;
	}
	public void setAccountNumbber(long accountNumbber) {
		this.accountNumbber = accountNumbber;
	}
	public String getAccountHolderAdd() {
		return accountHolderAdd;
	}
	public void setAccountHolderAdd(String accountHolderAdd) {
		this.accountHolderAdd = accountHolderAdd;
	}
	public long getAccountHolderPhn() {
		return accountHolderPhn;
	}
	public void setAccountHolderPhn(long accountHolderPhn) {
		this.accountHolderPhn = accountHolderPhn;
	}
	
	
	

}
