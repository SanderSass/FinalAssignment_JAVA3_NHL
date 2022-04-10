package com.company.Main.Meal;

public abstract class Meal {
    protected int price;
    protected int portion;
    protected String drink;
    protected boolean specialMeal;

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

    public boolean isSpecialMeal() {
        return specialMeal;
    }

    public void setSpecialMeal(boolean specialMeal) {
        this.specialMeal = specialMeal;
    }
}
