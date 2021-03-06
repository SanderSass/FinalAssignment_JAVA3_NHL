package com.company.Main.Ticket;

import com.company.Main.Person.Passenger;
import com.company.Main.Ticket.Ticket;

import java.time.LocalDate;
import java.time.Period;

public class SecondClass extends Ticket {
    public SecondClass(int seatNo, String tripNo, LocalDate departureDate, LocalDate arrivalDate)
    {
        this.price = 50;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.seatNo = seatNo;
        this.tripNo = tripNo;
        this.maxNormalMeal = 1;
        this.maxNormalMealDrink = 1;
    }

    /**
     * get discounted price
     * @param passenger
     * @return true if passenger is under 18 years old
     */
    @Override
    public double getDiscountedPrice(Passenger passenger)
    {
        if (passenger.getAge() <= 18)
        {
            return this.price -= 25;
        }
        return this.price;
    }
}
