package org.weather.displays;

import org.weather.Observer;
import org.weather.WeatherData;

/**
 * This display element shows the current measurements from the WeatherData object.
 * This display implements Observer so it can get the changes from the WeatherData object.
 * It also implements DisplayElement because our API is going to require all display elements to implement this interface.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private double temperature;
    private double humidity;

    /*
     * The constructor is passed the weatherData object (the Subject) and we use it to register the display as an observer
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        // since the pattern is in PULL mode, get the weather data from the Subject using the WeatherData's getter methods
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    /*
     * The display() method just prints out the most recent temperature, humidity and pressure
     */
    @Override
    public void display() {
        // display current measurements
        System.out.println("Current conditions");
        System.out.println("Temperature: " + temperature + " F degress");
        System.out.println("Humidity: " + humidity + "%");
    }
}
