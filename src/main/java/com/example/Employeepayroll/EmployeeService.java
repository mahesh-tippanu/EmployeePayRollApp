package com.example.EmployeePayrollservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.EmployeeDetails;
import com.example.Repository.Repository;

@Service
public class EmployeeService {
	 @Autowired
	    Repository Repository;

	    //Insert Details into DB Table
	    public EmployeeDetails postDetails(EmployeeDetails employeeDetails){
	        EmployeeDetails employeeDetails1=new EmployeeDetails(employeeDetails);
	        Repository.save(employeeDetails1);
	        return employeeDetails1;
	    }

	    //Display  Employee Details
	    public Optional<EmployeeDetails> getDetails(Long id){
	        return Repository.findById(id);
	    }

	    //Edit or Update Employee Details
	    public EmployeeDetails putDetails(EmployeeDetails employeeDetails,Long id){
	        EmployeeDetails employeeDetails1=new EmployeeDetails(employeeDetails,id);
	        Repository.save(employeeDetails1);
	        return employeeDetails1;
	    }

	    //Delete Employee Details
	    public String deleteDetails(Long id){
	        EmployeeDetails employeeDetails=new EmployeeDetails(id);
	        Repository.delete(employeeDetails);
	        return "record deleted";
	    }
}
