# Weather Monitoring Application

The weather station will be based on patent pending WeatherData object, which tracks the current weather conditions such as temperature, humidity and barometric pressure. 
This application initially provides three display elements: current conditions, weather statistics and a simple forecast, all updated in real time as the WeatherData object
acquires the most recent measurements.

## Description

The three players in the system are 

1. **the weather station**: the physical device that acquires the actual weather data
2. **the WeatherData object**: tracks the data coming from the Weather Station and updates the displays
3. **the display**: shows users the current weather conditions

## Exercise goal 
The WeatherData object knows how to talk to the physical WeatherStation, to get updated data. The WeatherData object then updates its displays for the three different
display elements: Current Conditions, Weather Statistics and a simple Forecast. The job is to create an app that uses the WeatherData object to update the three displays.
