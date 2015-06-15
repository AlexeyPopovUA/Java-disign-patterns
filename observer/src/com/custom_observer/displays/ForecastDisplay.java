package com.custom_observer.displays;

import com.custom_observer.observers.Observer;
import com.custom_observer.subjects.Subject;
import com.utils.Utils;


public class ForecastDisplay implements Observer, Display {

    private float temperature;

    private float humidity;

    private float pressure;

    private Subject weatherObject;

    public void  ForecastDisplay(Subject weatherObject){
        weatherObject.registerObserver(this);
        this.weatherObject = weatherObject;
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions display: ");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);

        Utils.printSimpleLine();
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
