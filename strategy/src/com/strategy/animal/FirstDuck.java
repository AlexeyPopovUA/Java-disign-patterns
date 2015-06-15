package com.strategy.animal;

import com.strategy.behavior.fly.FlyWithWings;
import com.strategy.behavior.quack.Quack;


public class FirstDuck extends Duck {

    public FirstDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a " + this.getClass().getName());
    }

}
