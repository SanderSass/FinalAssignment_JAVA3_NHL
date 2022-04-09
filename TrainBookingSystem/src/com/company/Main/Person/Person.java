package com.company.Main.Person;

import com.company.Main.Meal.Meal;
import java.time.LocalDate;
import java.util.HashSet;

public abstract class Person {
    protected String name;
    protected LocalDate dateOfBirth;
    protected HashSet<Meal> meal;

    // Getters and setters
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

    public HashSet<Meal> getMeal() {
        return meal;
    }

    public void setMeal(HashSet<Meal> meal) {
        this.meal = meal;
    }
}
