package org.weather.displays;

/**
 * This display shows the weather forecast based on the barometer
 */
public class StatisticsDisplay implements DisplayElement {

    private double temperature;
    private double humidity;
    private double pressure;

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        // display the average, min and max measurements
    }
}
