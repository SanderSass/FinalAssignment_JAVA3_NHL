package com.company.Exceptions;

public class NoneExistantTripException extends Exception {
    public NoneExistantTripException() {
        super("Trip does not exist");
    }
}