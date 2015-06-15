package com.native_observer;


import com.native_observer.displays.CurrentConditionsDisplay;
import com.native_observer.displays.ForecastDisplay;
import com.native_observer.observable.WeatherData;
import com.utils.Utils;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.addObserver(conditionsDisplay);
        weatherData.addObserver(forecastDisplay);

        Utils.printDoubleLine();

        weatherData.setMeasurements(37, 765, 80);

        Utils.printDoubleLine();

        weatherData.setMeasurements(25, 750, 90);

        Utils.printDoubleLine();

        weatherData.deleteObserver(forecastDisplay);

        weatherData.setMeasurements(44.8f, 754, 76.6f);

        Utils.printDoubleLine();


    }


}
