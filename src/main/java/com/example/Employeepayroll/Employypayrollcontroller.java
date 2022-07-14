package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeePayrollservice.EmployeeService;
import com.example.Model.EmployeeDetails;

@RestController
public class Employypayrollcontroller {
	@Autowired
	EmployeeService employeeService;
	
	 //PostMapping Employee Details
    @PostMapping("/postMap")
    public EmployeeDetails postDetail(@RequestBody EmployeeDetails employeeDetails){
        EmployeeDetails employeeDetails1=employeeService.postDetails(employeeDetails);
        return employeeDetails1;
    }

    //GetMapping Employee Details
    @GetMapping("/getMap/{id}")
    public Optional<EmployeeDetails> getDetail(@PathVariable Long id){
        Optional<EmployeeDetails> employeeDetails=employeeService.getDetails(id);
        return employeeDetails;
    }

    //PutMapping Employee Details
    @PutMapping("/putMap/{id}")
    public EmployeeDetails putDetails(@RequestBody EmployeeDetails employeeDetails,@PathVariable Long id){
        EmployeeDetails employeeDetails1=employeeService.putDetails(employeeDetails,id);
        return employeeDetails1;
    }

    //Delete Employee Details
    @DeleteMapping("/deleteMap/{id}")
    public String deleteDetails(@PathVariable Long id){
        String employeeDetails=employeeService.deleteDetails(id);
        return "record deleted" ;
    }
}