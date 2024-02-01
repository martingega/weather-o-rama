package org.weather;

import org.weather.displays.CurrentConditionsDisplay;
import org.weather.displays.ForecastDisplay;
import org.weather.displays.StatisticsDisplay;

import java.util.ArrayList;

/**
 * The WeatherData object tracks the data coming
 * from the Weather Station and updates the displays
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers; // we add an ArrayList to hold the Observers and we create it in the constructor

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>(); // we create the observers ArrayList here in the constructor
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
     * This method gets called whenever the weather measurements have been updated.
     * We notify the observers when we get updated measurements from the Weather Station
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /*
     * Rather than reading actual weather data off a device we're going to use this setter method
     * to test our display elements. For fun we could write code to grab measurements elsewhere
     */
    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    /*
     * This is where we tell all the observers about the state.
     * Because they are all Observers, we know they will implement update()
     * so we know how to notify them.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }
}
