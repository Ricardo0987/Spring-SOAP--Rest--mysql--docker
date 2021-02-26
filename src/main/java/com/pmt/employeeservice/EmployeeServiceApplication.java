package com.pmt.employeeservice;

import com.pmt.employeeservice.services.EmployeeServiceSoap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.xml.ws.Endpoint;


@SpringBootApplication
public class EmployeeServiceApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EmployeeServiceApplication.class, args);
        EmployeeServiceSoap service = ctx.getBean(EmployeeServiceSoap.class);
        Endpoint.publish("http://localhost:4444/employeeServiceSoap", service);

    }

    @Bean
    public EmployeeServiceSoap employeeServiceSoap() {
        return new EmployeeServiceSoap();
    }

}



