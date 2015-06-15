package com.studying.decorator;


import com.studying.decorator.beverages.DarkRoast;
import com.studying.decorator.beverages.Espresso;
import com.studying.decorator.business.Beverage;
import com.studying.decorator.decorators.Milk;
import com.studying.decorator.decorators.Mocha;
import com.studying.decorator.decorators.Soy;
import com.studying.decorator.decorators.Whip;

public class StartCoffeeApp {
    public  static  void main(String[] args){

        Beverage beverage = new DarkRoast();

        beverage = new Milk(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " - " + beverage.cost());

        Beverage beverage2 = new Espresso();

        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " - " + beverage2.cost());
    }
}
