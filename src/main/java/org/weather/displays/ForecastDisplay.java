package org.weather.displays;

import org.weather.Observer;
import org.weather.WeatherData;

/**
 * This display shows the weather forecast based on the barometer
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private double currentPressure = 29.92;
    private double lastPressure;
    private final WeatherData weatherData;

    /*
     * The constructor is passed the weatherData object (the Subject) and we use it to register the display as an observer
     */
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        // display the forecast
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("The weather will be the same.");
        } else {
            System.out.println("Incoming cooler and rainy weather!");
        }
    }
}
