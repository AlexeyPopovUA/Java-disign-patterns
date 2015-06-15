package com.custom_observer;


import com.custom_observer.displays.CurrentConditionsDisplay;
import com.custom_observer.displays.ForecastDisplay;
import com.custom_observer.displays.HeatIndexDisplay;
import com.custom_observer.displays.StatisticsDisplay;
import com.custom_observer.subjects.WeatherData;
import com.utils.Utils;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();

        weatherData.registerObserver(conditionsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(heatIndexDisplay);

        Utils.printDoubleLine();

        weatherData.setMeasurements(37, 765, 80);

        Utils.printDoubleLine();

        weatherData.setMeasurements(25, 750, 90);

        Utils.printDoubleLine();

        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(44.8f, 754, 76.6f);

        Utils.printDoubleLine();

        weatherData.registerObserver(statisticsDisplay);

        weatherData.setMeasurements(21, 767, 56);
    }


}
