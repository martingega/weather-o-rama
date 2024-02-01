package org.weather;

import org.weather.displays.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {

        // First create the WeatherData object
        WeatherData weatherData = new WeatherData();
        // Create the current conditions display and pass it the WeatherData object
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
