package com.qsp.Banking_Managment_system.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Employees;
import com.qsp.Banking_Managment_system.repo.EmployeesRepo;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeesRepo employeesRepo;
	
	public Employees saveEmployees(Employees employees) {
		return employeesRepo.save(employees);
	}
	
	public Employees fetchByEmpId(int employeeId) {
		return employeesRepo.findById(employeeId).get();
	}
	
	public List<Employees> fetchAllEmp() {
		return employeesRepo.findAll();
		
	}
}
