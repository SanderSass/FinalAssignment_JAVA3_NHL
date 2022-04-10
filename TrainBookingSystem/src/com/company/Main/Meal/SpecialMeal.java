package com.company.Main.Meal;

public class SpecialMeal extends Meal {

    public SpecialMeal(int price, int portion, String drink)
    {
        this.price = price;
        this.portion = portion;
        this.drink = drink;
        this.specialMeal = true;
    }
}
