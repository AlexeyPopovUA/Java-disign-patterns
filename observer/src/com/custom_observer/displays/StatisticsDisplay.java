package com.custom_observer.displays;

import com.custom_observer.observers.Observer;
import com.custom_observer.subjects.Subject;
import com.utils.Utils;


public class StatisticsDisplay implements Observer, Display {

    private float humidity;

    private float pressure;

    private Subject weatherObject;

    public void  StatisticsDisplay(Subject weatherObject){
        weatherObject.registerObserver(this);
        this.weatherObject = weatherObject;
    }

    @Override
    public void display() {
        System.out.println("Statistics conditions display: ");
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);

        Utils.printSimpleLine();
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
