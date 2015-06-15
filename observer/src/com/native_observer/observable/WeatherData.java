package com.native_observer.observable;

import java.util.Observable;


public class WeatherData extends Observable {

    private float temperature;

    private float pressure;

    private float humidity;

    public void setMeasurements(float temp, float press, float hum){
        this.temperature = temp;
        this.pressure = press;
        this.humidity = hum;

        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

}
