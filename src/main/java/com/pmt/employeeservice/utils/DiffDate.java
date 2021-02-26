package com.pmt.employeeservice.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DiffDate {

    public static String getStr(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(date, dateNow);
        return String.valueOf(period.getYears()).concat(" year(s), ")
                .concat(String.valueOf(period.getMonths())).concat(" month(s), ")
                .concat(String.valueOf(period.getDays()).concat(" day(s)"));
    }

    public static int getYears(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(date, dateNow);
        return period.getYears();
    }
}
