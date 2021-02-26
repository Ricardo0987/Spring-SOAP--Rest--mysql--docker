package com.pmt.employeeservice.repositories;

import com.pmt.employeeservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, String> {


    @Override
    Optional<Employee> findById(String s);

    @Override
    boolean existsById(String s);
}
