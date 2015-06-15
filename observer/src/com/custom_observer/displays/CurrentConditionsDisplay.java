package com.custom_observer.displays;

import com.custom_observer.observers.Observer;
import com.custom_observer.subjects.Subject;
import com.utils.Utils;


public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;

    private float pressure;

    private Subject weatherObject;

    public void  CurrentConditionsDisplay(Subject weatherObject){
        //weatherObject.registerObserver(this);
        this.weatherObject = weatherObject;
    }

    @Override
    public void display() {
        System.out.println("Current conditions display: ");
        System.out.println("Temperature: " + temperature);
        System.out.println("Pressure: " + pressure);

        Utils.printSimpleLine();
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;

        display();
    }
}
