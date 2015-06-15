package com.strategy.behavior.fly;


public class CannotFly implements FlyBehavior{
    public void fly(){
        System.out.println("I can't fly");
    }
}
