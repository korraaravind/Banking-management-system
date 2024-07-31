package com.qsp.Banking_Managment_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dao.EmployeeDao;
import com.qsp.Banking_Managment_system.dto.Employees;
import com.qsp.Banking_Managment_system.service.EmployeeService;

@RestController
public class EmployeeContoller {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/saveEmployees")
	public Employees saveEmployees(@RequestBody Employees employees) {
		return employeeService.saveEmployees(employees);
	}

	@GetMapping("/fetchByEmpId")
	public Employees fetchByEmpId(@RequestParam int employeeId) {
		return employeeService.fetchByEmpId(employeeId);
	}

	@GetMapping("/fetchAllEmp")
	public List<Employees> fetchAllEmp() {
		return employeeService.fetchAllEmp();

	}
}
