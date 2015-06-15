package com.strategy;


import com.strategy.animal.Duck;
import com.strategy.animal.FirstDuck;
import com.strategy.animal.SecondDuck;

public class StartApp {
    public static void main(String[] args){
        Duck first = new FirstDuck();
        Duck second = new SecondDuck();

        performBehavior(first);
        performBehavior(second);
    }

    public static void performBehavior(Duck duck){
        duck.display();
        duck.performQuack();
        duck.performFly();
    }

}