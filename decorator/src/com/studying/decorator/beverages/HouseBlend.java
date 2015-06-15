package com.studying.decorator.beverages;


import com.studying.decorator.business.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 1.57;

    }
}
