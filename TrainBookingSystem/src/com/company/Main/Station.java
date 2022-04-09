package com.company.Main;

import com.company.Exceptions.ExistingCompanyException;

import java.util.HashSet;

public class Station {
    private final String name;
    private final Destination location;
    private final HashSet<Company> companies;

    public Station(String name, Destination locations) {
        this.name = name;
        this.location = locations;
        this.companies = new HashSet<>();
    }

    /**
     * Method to get all past trips from all companies in this station.
     * @return String with all past trips from all companies in this station.
     */
    public HashSet<Trip> getALlTrips() {
        HashSet<Trip> pastTrips = new HashSet<>();
        for (Company company : this.companies) {
            pastTrips.addAll(company.getTrips());
        }
        return pastTrips;
    }

    /**
     * Method to add a company in this station.
     * @return String with the company added.
     */
    public String addCompany(Company company) {
        try {
            if(!this.companies.contains(company)) {
                this.companies.add(company);
            }else {
                throw new ExistingCompanyException();
            }
        } catch (ExistingCompanyException e) {
            return e.getMessage();
        }
        return "Company" + company+ " added successfully";
    }

    // TODO: 4/9/2022  add getAllPastTrips method
    // TODO: 4/9/2022  add getALlExpenses method
    // TODO: 4/9/2022  add getProfits method

    //Getters
    public String getName() {
        return name;
    }

    public Destination getLocation() {
        return location;
    }

    public HashSet<Company> getCompanies() {
        return companies;
    }
}