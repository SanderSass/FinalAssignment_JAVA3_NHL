package com.company.Main;

import java.time.LocalDate;

public abstract class Ticket
{
    protected double price;
    protected LocalDate departureDate;
    protected LocalDate arrivalDate;
    protected int maxNormalMeal;
    protected int maxSpecialMeal;
    protected int maxNormalMealDrink;
    protected int maxSpecialMealDrink;

    //Getters & Setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getMaxNormalMeal() {
        return maxNormalMeal;
    }

    public void setMaxNormalMeal(int maxNormalMeal) {
        this.maxNormalMeal = maxNormalMeal;
    }

    public int getMaxSpecialMeal() {
        return maxSpecialMeal;
    }

    public void setMaxSpecialMeal(int maxSpecialMeal) {
        this.maxSpecialMeal = maxSpecialMeal;
    }

    public int getMaxNormalMealDrink() {
        return maxNormalMealDrink;
    }

    public void setMaxNormalMealDrink(int maxNormalMealDrink) {
        this.maxNormalMealDrink = maxNormalMealDrink;
    }

    public int getMaxSpecialMealDrink() {
        return maxSpecialMealDrink;
    }

    public void setMaxSpecialMealDrink(int maxSpecialMealDrink) {
        this.maxSpecialMealDrink = maxSpecialMealDrink;
    }
}
