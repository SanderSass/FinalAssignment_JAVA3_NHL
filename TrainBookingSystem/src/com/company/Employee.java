package com.company;

import java.time.LocalDate;

abstract class Employee {
    private String name;
    private LocalDate dateOfBirth;

//    public Employee(String name, LocalDate dateOfBirth) {
//        this.name = name;
//        this.dateOfBirth = dateOfBirth;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
