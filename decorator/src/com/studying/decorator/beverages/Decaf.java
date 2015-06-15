package com.studying.decorator.beverages;


import com.studying.decorator.business.Beverage;

public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return .80;

    }
}
