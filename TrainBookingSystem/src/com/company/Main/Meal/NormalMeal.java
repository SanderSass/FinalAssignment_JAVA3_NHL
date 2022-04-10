package com.company.Main.Meal;

public class NormalMeal extends Meal {
    public NormalMeal(String drink)
    {
        this.price = 25;
        this.portion = 1;
        this.drink = drink;
        this.specialMeal = "Normal meal";
    }
}
