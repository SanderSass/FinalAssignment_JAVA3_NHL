package com.company.Main.Ticket;

import com.company.Main.Person.Passenger;
import java.time.LocalDate;

public class FirstClass extends Ticket {
    public FirstClass(int seatNo, String tripNo, LocalDate departureDate, LocalDate arrivalDate)
    {
        this.price = 100;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.seatNo = seatNo;
        this.tripNo = tripNo;
        this.maxNormalMeal = 2;
        this.maxNormalMealDrink = 2;
    }

    /**
     * get discounted price
     * @param passenger
     * @return true if passenger is under 18 years old
     */
    @Override
    public double getDiscountedPrice(Passenger passenger) {
        if (passenger.getAge() <= 18 || passenger.getAge() >= 60) {
            return this.price -= 60;
        } else if (passenger.getAge() > 19 && passenger.getAge() <= 25) {
            return this.price -= 40;
        } else if (passenger.getAge() > 25 && passenger.getAge() <= 59) {
            return this.price -= 20;
        }
        return this.price;
    }
}
