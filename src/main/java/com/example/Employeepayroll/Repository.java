package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.EmployeeDetails;

public interface Repository extends JpaRepository<EmployeeDetails, Long> {

}
