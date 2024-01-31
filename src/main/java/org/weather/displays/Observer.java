package org.weather.displays;

/**
 * The Observer interface is implemented by all observers, so they all have to implement
 * the update() method. Here we're passing the measurements to the observers.
 */
public interface Observer {

    void update(double temperature, double humidity, double pressure); // temperature, humidity and pressure are the state values the Observers get from the Subject when a weather measurement changes

}
