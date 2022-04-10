package com.company.Main.Meal;

public abstract class Meal {
    protected int price;
    protected int portion;
    protected String drink;
    protected String specialMeal;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSpecialMeal() {
        return specialMeal;
    }

    public void setSpecialMeal(String specialMeal) {
        this.specialMeal = specialMeal;
    }
}
