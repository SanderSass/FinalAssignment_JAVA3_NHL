package com.company.Main.Person;

import com.company.Main.Meal.Meal;
import com.company.Main.Ticket.Ticket;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Passenger extends Person {
    private HashSet<Ticket> boughtTicket;
    private int age;

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
        if (dateOfBirth != null)
        {
            age = Period.between(dateOfBirth, curDate).getYears();
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

    /**
     * @return
     */
    public boolean checkMeal(Ticket ticket)
    {
        int numberOfPortions = 0;
        boolean condition = true;
        for(Meal meal : this.meal)
        {
            if(meal.getSpecialMeal().equals("Normal meal"))
            {
                numberOfPortions++;
                if (meal.getPortion() > ticket.getMaxNormalMeal())//??
                {
                    condition = false;
                }
            }
            if(meal.getSpecialMeal().equals("Special meal"))
            {
                numberOfPortions++;
                if (meal.getPortion() > ticket.getMaxSpecialMeal())//??
                {
                    condition = false;
                }
            }
        }
        return condition;
    }
}
