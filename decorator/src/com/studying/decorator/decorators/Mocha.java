package com.studying.decorator.decorators;

import com.studying.decorator.business.Beverage;
import com.studying.decorator.business.CondimentDecorator;



public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
