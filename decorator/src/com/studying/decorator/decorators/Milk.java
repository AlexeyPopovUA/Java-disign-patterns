package com.studying.decorator.decorators;


import com.studying.decorator.business.Beverage;
import com.studying.decorator.business.CondimentDecorator;

public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.34 + beverage.cost();
    }
}
