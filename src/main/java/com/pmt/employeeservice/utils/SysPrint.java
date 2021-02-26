package com.pmt.employeeservice.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class SysPrint {

    @SneakyThrows
    public static void toJson(Object obj) {
        //pretty print
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        System.out.println(json);

    }
}
