package com.strategy.animal;

import com.strategy.behavior.fly.FlyBehavior;
import com.strategy.behavior.quack.QuackBehavior;

public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks can swim");
    }

}
