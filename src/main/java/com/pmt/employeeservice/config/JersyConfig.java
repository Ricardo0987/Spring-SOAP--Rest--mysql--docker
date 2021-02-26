package com.pmt.employeeservice.config;

import com.pmt.employeeservice.services.EmployeeServiceSoap;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/api")
public class JersyConfig extends ResourceConfig {
    @PostConstruct
    public void init() {
        System.err.println("jehddjll");
        register(EmployeeServiceSoap.class);
        register(JersyException.class);

    }
}
