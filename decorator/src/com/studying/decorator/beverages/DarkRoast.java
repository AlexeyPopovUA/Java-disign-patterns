package com.studying.decorator.beverages;


import com.studying.decorator.business.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
