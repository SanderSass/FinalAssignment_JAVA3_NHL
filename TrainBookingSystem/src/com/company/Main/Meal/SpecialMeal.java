package com.company.Main.Meal;

public class SpecialMeal extends Meal {

    public SpecialMeal(int portion, String drink)
    {
        this.price = 50;
        this.portion = portion;
        this.drink = drink;
        this.specialMeal = true;
    }
}
