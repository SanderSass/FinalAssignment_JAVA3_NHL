package com.company;

import java.util.HashSet;

public class Station {
    private String name;
    private String location;
    private HashSet<Company> companies;

    public Station(String name, String location, HashSet<Company> companies) {
        this.name = name;
        this.location = location;
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HashSet<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(HashSet<Company> companies) {
        this.companies = companies;
    }
}