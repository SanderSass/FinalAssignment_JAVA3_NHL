package com.company.Main.Person;

import com.company.Main.Person.Person;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private boolean busy = false;

    public Employee(String name, LocalDate dateOfBirth, double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy() {
        this.busy = true;
    }

    public void setFree() {
        this.busy = false;
    }
}
