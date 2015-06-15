package com.custom_observer.subjects;

import com.custom_observer.observers.Observer;

import java.util.ArrayList;


public class WeatherData implements Subject {

    private float temperature;

    private float pressure;

    private float humidity;

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int observerIndex = observers.indexOf(observer);

        if(observerIndex >= 0){
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);

            observer.update(temperature, pressure, humidity);
        }
    }

    public void setMeasurements(float temp, float press, float hum){
        this.temperature = temp;
        this.pressure = press;
        this.humidity = hum;

        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }


}
