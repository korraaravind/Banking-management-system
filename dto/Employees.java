package com.qsp.Banking_Managment_system.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employee_Name;
	private int employee_Age;
	private long employee_Phn_Number;
	private String employee_Address;
	private String employee_company_Name;
	private String employee_Roll;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public int getEmployee_Age() {
		return employee_Age;
	}
	public void setEmployee_Age(int employee_Age) {
		this.employee_Age = employee_Age;
	}
	public long getEmployee_Phn_Number() {
		return employee_Phn_Number;
	}
	public void setEmployee_Phn_Number(long employee_Phn_Number) {
		this.employee_Phn_Number = employee_Phn_Number;
	}
	public String getEmployee_Address() {
		return employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		this.employee_Address = employee_Address;
	}
	public String getEmployee_company_Name() {
		return employee_company_Name;
	}
	public void setEmployee_company_Name(String employee_company_Name) {
		this.employee_company_Name = employee_company_Name;
	}
	public String getEmployee_Roll() {
		return employee_Roll;
	}
	public void setEmployee_Roll(String employee_Roll) {
		this.employee_Roll = employee_Roll;
	}

	
}
