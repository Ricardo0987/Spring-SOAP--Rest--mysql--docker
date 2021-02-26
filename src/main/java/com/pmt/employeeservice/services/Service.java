package com.pmt.employeeservice.services;

import com.pmt.employeeservice.entities.Employee;

import java.util.List;

public interface Service {
    public Employee addEmployee(Employee e);

    public List<Employee> getAll();

}
