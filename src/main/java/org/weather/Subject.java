package org.weather;

/**
 * Objects use the Subject interface to register as observers
 * and also to remove themselves from being observers
 */
public interface Subject {

    void registerObserver(Observer obs); // this method take the Observer to be registered as an argument

    void removeObserver(Observer obs); // this method take the Observer to be removed as an argument

    void notifyObservers(); // this method is called to notify all observers when the Subject's state has changed

}
