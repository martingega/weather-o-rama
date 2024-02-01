package org.weather;

/**
 * The Observer interface is implemented by all observers
 * so they all have to implement the update() method.
 */
public interface Observer {

    void update(); // PULL mode for Observer

}
