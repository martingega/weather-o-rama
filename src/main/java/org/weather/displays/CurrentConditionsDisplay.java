package org.weather.displays;

import org.weather.Observer;
import org.weather.Subject;

/**
 * This display element shows the current measurements from the WeatherData object.
 * This display implements Observer so it can get the changes from the WeatherData object.
 * It also implements DisplayElement because our API is going to require all display elements to implement this interface.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final Subject weatherData;
    private double temperature;
    private double humidity;
    private double pressure;

    /*
     * The constructor is passed the weatherData object (the Subject) and we use it to register the display as an observer
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temperature, double humidity, double pressure) {

        // when update() is called we save the temperature, humidity and pressure and call display()
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
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
        System.out.println("Pressure: " + pressure);
    }
}
