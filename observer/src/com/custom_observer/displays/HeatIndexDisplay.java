package com.custom_observer.displays;


import com.custom_observer.observers.Observer;
import com.utils.Utils;


public class HeatIndexDisplay implements Observer, Display {

    private double heatIndex;

    private double calculateHeatIndex(float T, float RH){
        double heatIndex = 16.923 + 1.85212*Math.pow(10, -1)*T + 5.37941*RH - 1.00254*Math.pow(10, -1)*T*RH + 9.41695*Math.pow(10, -3)*Math.pow(T, 2) +
                7.28898*Math.pow(10, -3)*Math.pow(RH, 2);

        return heatIndex;
    }

    @Override
    public void display() {
        System.out.println(getHeatIndex());

    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        setHeatIndex(calculateHeatIndex(temperature, pressure));

        display();
        Utils.printSimpleLine();
    }

    public double getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(double heatIndex) {
        this.heatIndex = heatIndex;
    }
}
