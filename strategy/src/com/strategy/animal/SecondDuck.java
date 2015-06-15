package com.strategy.animal;

import com.strategy.animal.Duck;
import com.strategy.behavior.fly.FlyByRocketPower;
import com.strategy.behavior.quack.Squeak;


public class SecondDuck extends Duck {

    public SecondDuck(){
        flyBehavior = new FlyByRocketPower();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a " + this.getClass().getName());
    }


}
