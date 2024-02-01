package org.weather;

import org.weather.displays.CurrentConditionsDisplay;
import org.weather.displays.ForecastDisplay;
import org.weather.displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {

        // First create the WeatherData object
        WeatherData weatherData = new WeatherData();
        // Create the current conditions display and pass it the WeatherData object
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // Create the Forecast display and pass it the WeatherData object
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        // Create the Statistics display and pass it the WeatherData object
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4);
        System.out.println("------------------------");
        weatherData.setMeasurements(82, 70, 29.2);
        System.out.println("------------------------");
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
