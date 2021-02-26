package com.pmt.employeeservice.controllers;

import com.pmt.employeeservice.entities.Employee;
import com.pmt.employeeservice.exceptions.InvalidAgeException;
import com.pmt.employeeservice.utils.DiffDate;
import com.pmt.employeeservice.utils.SysPrint;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/employee")
public class EmployeeRestController {


    @SneakyThrows
    @GetMapping
    public ResponseEntity<Employee> getEmployee(@Valid @RequestBody Employee employee) {
        String currentAgeStr = DiffDate.getStr(employee.getBirthDate());
        String companyLinkTime = DiffDate.getStr(employee.getDateLinkCompany());

        employee.setCurrentAge(currentAgeStr);
        employee.setCompanyLinkTime(companyLinkTime);

        int currentAgeInt = DiffDate.getYears(employee.getBirthDate());
        boolean isAdult = currentAgeInt >= 18;

        if (!isAdult) {
            throw new InvalidAgeException(currentAgeInt);
        }

        SysPrint.toJson(employee);
        return ResponseEntity.ok(employee);
    }
}