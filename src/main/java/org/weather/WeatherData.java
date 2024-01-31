package org.weather;

/**
 * The WeatherData object tracks the data coming
 * from the Weather Station and updates the displays
 */
public class WeatherData {

    // returns the most recent weather measurement for temperature
    public double getTemperature(){
        return 0.0;
    }

    // returns the most recent weather measurement for humidity
    public double getHumidity(){
        return 0.0;
    }

    // returns the most recent weather measurement for barometric pressure
    public double getPressure(){
        return 0.0;
    }

    /*
     * This method gets called whenever the weather
     * measurements have been updated
     */
    public void measurementsChanged(){
        // the code goes here
    }

}
