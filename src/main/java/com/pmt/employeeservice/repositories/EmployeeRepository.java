package com.pmt.employeeservice.repositories;

import com.pmt.employeeservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
