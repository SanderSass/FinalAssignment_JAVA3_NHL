package com.company.Main.Meal;

public class NormalMeal extends Meal {
    public NormalMeal(int portion, String drink)
    {
        this.price = 25;
        this.portion = portion;
        this.drink = drink;
        this.specialMeal = false;
    }
}
