package com.company.Main.Person;

import com.company.Exceptions.AlreadyHasTicketException;
import com.company.Main.Company;
import com.company.Main.Meal.Meal;
import com.company.Main.Ticket.SecondClass;
import com.company.Main.Ticket.Ticket;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Passenger extends Person {
    private HashSet<Ticket> boughtTicket;

    public Passenger(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.boughtTicket = new HashSet<>();
        this.meal = new HashSet<>();
    }

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

    public int getAge() {
        LocalDate curDate = LocalDate.now();
        if ((dateOfBirth != null && (curDate != null)))
        {
            int age = Period.between(dateOfBirth, curDate).getYears();
            return age;
        }
        return 0;
    }

    public boolean alreadyBoughtTicket(String tripNo)
    {
        boolean condition = false;
        for(Ticket ticket : boughtTicket)
        {
            if(ticket.getTripNo().equals(tripNo))
            {
                condition = true;
                break;
            }
        }
        return condition;
    }
}
