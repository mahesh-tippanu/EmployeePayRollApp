package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.EmployeeDetails;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<EmployeeDetails, Long> {

}
