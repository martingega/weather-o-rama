package org.weather.displays;

import org.weather.Observer;
import org.weather.WeatherData;

/**
 * This display element keeps track of the minimium/average/maximum measurements and displays them
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private double maxTemperature = 0.0;
    private double minTemperature = 300;
    private double temperatureSum = 0.0;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        double temperature = weatherData.getTemperature();
        temperatureSum += temperature;
        numReadings++;
        // calcolo della temperatura massima
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        // calcolo della temperatura minima
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        display();
    }

    @Override
    public void display() {
        // display the average, min and max measurements
        double avgTemperature = temperatureSum / numReadings;
        System.out.println("Average temperature: " + avgTemperature);
        System.out.println("Maximum temperature: " + maxTemperature);
        System.out.println("Minimum temperature: " + minTemperature);
    }
}
