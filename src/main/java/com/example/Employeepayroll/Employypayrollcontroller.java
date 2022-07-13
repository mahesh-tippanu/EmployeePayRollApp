package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeePayrollservice.EmployeeService;

@RestController
public class Employypayrollcontroller {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/welcome")
	public String displayMessage(){
    return employeeService.Message();
}
}