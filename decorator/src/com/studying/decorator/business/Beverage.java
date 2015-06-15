package com.studying.decorator.business;



public abstract class Beverage {

    public String description = "Abstract Beverage";

    public String getDescription() {

        return description;
    }

    public abstract double cost();
}
