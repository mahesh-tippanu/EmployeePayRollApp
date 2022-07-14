package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dto.EmployeeDto;
import com.example.Dto.ResponseDto;
import com.example.EmployeePayrollservice.EmployeeService;
import com.example.Model.EmployeeDetails;

@RestController
public class Employypayrollcontroller {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/hello")
    public String getMessage(){
        return "Hello World !!!!";
    }
	
	 //PostMapping Employee Details
  //  @PostMapping("/postMap")
  //  public EmployeeDetails postDetail(@RequestBody EmployeeDetails employeeDetails){
   //     EmployeeDetails employeeDetails1=employeeService.postDetails(employeeDetails);
     //   return employeeDetails1;
    //}

    //GetMapping Employee Details
   // @GetMapping("/getMap/{id}")
   // public Optional<EmployeeDetails> getDetail(@PathVariable Long id){
     //   Optional<EmployeeDetails> employeeDetails=employeeService.getDetails(id);
       // return employeeDetails;
    //}

    //PutMapping Employee Details
    //@PutMapping("/putMap/{id}")
    //public EmployeeDetails putDetails(@RequestBody EmployeeDetails employeeDetails,@PathVariable Long id){
      //  EmployeeDetails employeeDetails1=employeeService.putDetails(employeeDetails,id);
        //return employeeDetails1;
    //}

    //Delete Employee Details
    //@DeleteMapping("/deleteMap/{id}")
    //public String deleteDetails(@PathVariable Long id){
      //  String employeeDetails=employeeService.deleteDetails(id);
        //return "record deleted" ;
    //}
//}

	 //************************** DTO *******************************//

    //GetMapping Employee Details
    @GetMapping("/getMap/{empId}")
    public ResponseEntity<ResponseDto> getEmployeePayrollData(@PathVariable int empId) {
        EmployeeDetails employeeDetails= employeeService.getEmployeeById(empId);
        ResponseDto respDTO= new ResponseDto("Get Call For ID Successful", employeeDetails);
        return new ResponseEntity<ResponseDto>(respDTO, HttpStatus.OK);
    }
    @PostMapping("/postMap")
    public ResponseEntity<ResponseDto> addEmployeePayrollData(@RequestBody EmployeeDto empPayrollDTO) {
        EmployeeDetails  empData= employeeService.createEmployeePayrollData(empPayrollDTO);
        ResponseDto respDTO= new ResponseDto("Created Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDto>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/putMap")
    public ResponseEntity<ResponseDto> updateEmployeePayrollData(@RequestBody EmployeeDto empPayrollDTO) {
        EmployeeDetails empData = employeeService.editEmployee(empPayrollDTO);
        ResponseDto respDTO= new ResponseDto("Updated Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDto>(respDTO, HttpStatus.OK);
    }
    @DeleteMapping("/deleteMap/{empId}")
    public ResponseEntity<ResponseDto> deleteEmployeePayrollData(@PathVariable("empId") int empId)
    {
    	employeeService.deleteEmployee(empId);
    	ResponseDto respDTO= new ResponseDto("Deleted Successfully", "Deleted id: "+empId);
        return new ResponseEntity<ResponseDto> (respDTO, HttpStatus.OK);

    }
}


