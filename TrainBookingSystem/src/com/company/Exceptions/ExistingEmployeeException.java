package com.company.Exceptions;

public class ExistingEmployeeException extends Exception {
    public ExistingEmployeeException() {
        super("Employee already exists");
    }
}
