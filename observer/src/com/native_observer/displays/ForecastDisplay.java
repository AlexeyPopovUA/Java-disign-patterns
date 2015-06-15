package com.native_observer.displays;

import com.native_observer.observable.WeatherData;
import com.utils.Utils;

import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, Display {

    private float temperature;

    private float humidity;

    private float pressure;

    private Observer weatherObject;

    public void  ForecastDisplay(Observer weatherObject){
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
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;

            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();

            display();
        }

    }
}
