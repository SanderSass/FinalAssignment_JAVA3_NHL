package com.company.Exceptions;

public class ExistingCompanyException extends Exception {
    public ExistingCompanyException() {
        super("Company already exists.");
    }
}
