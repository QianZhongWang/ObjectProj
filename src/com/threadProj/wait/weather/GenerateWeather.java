package com.threadProj.wait.weather;

public class GenerateWeather implements Runnable {
    Weather weather;

    public GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        weather.generate();

    }
}
