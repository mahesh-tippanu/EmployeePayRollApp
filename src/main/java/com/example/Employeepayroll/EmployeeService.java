package com.example.EmployeePayrollservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.EmployeeDto;
import com.example.Model.EmployeeDetails;
import com.example.Repository.Repository;

@Service
public class EmployeeService {
	 @Autowired
	    Repository Repository;

	 ArrayList<EmployeeDetails> EmployeeArrayList;
	 
	    //Insert Details into DB Table
	   // public EmployeeDetails postDetails(EmployeeDetails employeeDetails){
	       // EmployeeDetails employeeDetails1=new EmployeeDetails(employeeDetails);
	      //  Repository.save(employeeDetails1);
	    //    return employeeDetails1;
	   // }

	    //Display  Employee Details
	   // public Optional<EmployeeDetails> getDetails(Long id){
	     //   return Repository.findById(id);
	    //}

	    //Edit or Update Employee Details
	    //public EmployeeDetails putDetails(EmployeeDetails employeeDetails,Long id){
	      //  EmployeeDetails employeeDetails1=new EmployeeDetails(employeeDetails,id);
	        //Repository.save(employeeDetails1);
	        //return employeeDetails1;
	    //}

	    //Delete Employee Details
	    //public String deleteDetails(Long id){
	      //  EmployeeDetails employeeDetails=new EmployeeDetails(id);
	        //Repository.delete(employeeDetails);
	        //return "record deleted";
	    //}
	    //****************************** Using DTO *******************************************************************
	    public List<EmployeeDetails> getEmployeePayrollData() 
	    {
	        List<EmployeeDetails> empDataList = new ArrayList<>();
	        empDataList.add(new EmployeeDetails(1, new EmployeeDto("Mahesh tippanu", "Male", "HR", 35000)));
	        return empDataList;
	    }
	    public EmployeeDetails getEmployeeById(int id) {
	        EmployeeDetails empData=new EmployeeDetails(1,new EmployeeDto("Mahesh", "Male", "HR", 35000));
	        return empData;
	    }


	    public EmployeeDetails createEmployeePayrollData(EmployeeDto employeePayrollDTO) {
	        EmployeeDetails empData=new EmployeeDetails(1, new EmployeeDto("Mahesh kumar tippanu", "Male", "HR", 35000));
	        return empData;
	    }

	    public EmployeeDetails editEmployee(EmployeeDto employeePayrollDTO) {
	        EmployeeDetails empData=new EmployeeDetails(1,employeePayrollDTO);
	        return empData;
	    }
	    public void deleteEmployee(int id) {
	    }
}
