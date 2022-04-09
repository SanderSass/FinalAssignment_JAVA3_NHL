package com.company.Exceptions;

public class NotEnoughCrewMembersException extends Exception {
    public NotEnoughCrewMembersException() {
        super("Not enough crew members");
    }
}
