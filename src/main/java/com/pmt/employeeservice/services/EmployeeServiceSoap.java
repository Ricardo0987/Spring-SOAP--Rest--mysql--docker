package com.pmt.employeeservice.services;

import com.pmt.employeeservice.entities.Employee;
import com.pmt.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class EmployeeServiceSoap implements Service {

    @Autowired
    private EmployeeRepository employeeRepository;

    @WebMethod
    @Override
    public Employee addEmployee(Employee e) {
        return employeeRepository.save(e);
    }


    @WebMethod
    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

}

