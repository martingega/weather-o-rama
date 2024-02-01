package org.weather;

/**
 * The Observer interface is implemented by all observers, so they all have to implement
 * the update() method. Here we're passing the measurements to the observers.
 */
public interface Observer {

    void update(); // PULL mode for Observer

}
