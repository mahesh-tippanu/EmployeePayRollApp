package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.Dto.EmployeeDto;

@Entity
public class EmployeeDetails {
	    @Id
	    @GeneratedValue
//	    @Column(name = "emp_id", nullable = false)
//	    private Long emp_id;
	    int id;
	    
	    String name;
	    Long salary;
	    String department;
	    String gender;
	    
	    public EmployeeDetails(int id, EmployeeDto employeeDTO) {
	        this.id=id;
	    	this.name=EmployeeDto.name;
	        this.department=EmployeeDto.department;
	        this.salary=EmployeeDto.salary;
	    }

	    public EmployeeDetails() {
	    }
	    public String getDepartment() {
	        return department;
	    }
	    
	    
	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }


	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Long getSalary() {
	        return salary;
	    }

	    public void setSalary(Long salary) {
	        this.salary = salary;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }


	    public Integer getId() {
	        return id;
	    }
	}


