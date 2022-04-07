package com.company.Person;

import com.company.Meal.Meal;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class Person {
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Meal> meals;

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

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}
