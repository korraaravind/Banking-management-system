package com.qsp.Banking_Managment_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.EmployeeDao;
import com.qsp.Banking_Managment_system.dto.Employees;
import com.qsp.Banking_Managment_system.repo.EmployeesRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Employees saveEmployees(Employees employees) {
		return employeeDao.saveEmployees(employees);
	}
	
	public Employees fetchByEmpId(int employeeId) {
		return employeeDao.fetchByEmpId(employeeId);
	}
	
	public List<Employees> fetchAllEmp() {
		return employeeDao.fetchAllEmp();
		
	}

}
