package com.qsp.Banking_Managment_system.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	private String ownerName;
	private double ownerInvestment;
	private String yearOfEstabletion;
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getOwnerInvestment() {
		return ownerInvestment;
	}
	public void setOwnerInvestment(double ownerInvestment) {
		this.ownerInvestment = ownerInvestment;
	}
	public String getYearOfEstabletion() {
		return yearOfEstabletion;
	}
	public void setYearOfEstabletion(String yearOfEstabletion) {
		this.yearOfEstabletion = yearOfEstabletion;
	}
	
	
	

}
