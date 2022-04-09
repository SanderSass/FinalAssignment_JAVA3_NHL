package com.company.Main.Person;

import com.company.Main.Meal.Meal;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Person {
    protected String name;
    protected LocalDate dateOfBirth;
    protected HashSet<Meal> meals;

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

    public HashSet<Meal> getMeals() {
        return meals;
    }

    public void setMeals(HashSet<Meal> meals) {
        this.meals = meals;
    }
}
