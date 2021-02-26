package com.pmt.employeeservice.exceptions;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(int currentAgeInt) {
        super("invalid age: ".concat(String.valueOf(currentAgeInt)).concat(", must be 18 or more"));
    }

}
