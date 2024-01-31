package org.weather;

import org.weather.displays.CurrentConditionsDisplay;
import org.weather.displays.ForecastDisplay;
import org.weather.displays.StatisticsDisplay;

/**
 * The WeatherData object tracks the data coming
 * from the Weather Station and updates the displays
 */
public class WeatherData {

    public double temperature;
    public double humidity;
    public double pressure;

    CurrentConditionsDisplay currentConditionsDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    public WeatherData(CurrentConditionsDisplay ccd, StatisticsDisplay sd, ForecastDisplay fd){
        currentConditionsDisplay = ccd;
        statisticsDisplay = sd;
        forecastDisplay = fd;
    }
    // returns the most recent weather measurement for temperature
    public double getTemperature(){
        return this.temperature;
    }

    // returns the most recent weather measurement for humidity
    public double getHumidity(){
        return this.humidity;
    }

    // returns the most recent weather measurement for barometric pressure
    public double getPressure(){
        return this.pressure;
    }

    /*
     * This method gets called whenever the weather
     * measurements have been updated
     */
    public void measurementsChanged(){

        // grab the most recent measurements by calling the WeatherData's getter methods
        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        // now update the three displays, call each display element to update its dsiplay passing it the most recent measurements
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

}
