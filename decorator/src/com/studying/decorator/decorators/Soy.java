package com.studying.decorator.decorators;

import com.studying.decorator.business.Beverage;
import com.studying.decorator.business.CondimentDecorator;



public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.12 + beverage.cost();
    }
}
