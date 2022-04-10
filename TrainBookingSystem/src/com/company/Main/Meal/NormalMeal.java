package com.company.Main.Meal;

public class NormalMeal extends Meal {
    public NormalMeal(int price, int portion, String drink)
    {
        this.price = price;
        this.portion = portion;
        this.drink = drink;
        this.specialMeal = false;
    }
}
