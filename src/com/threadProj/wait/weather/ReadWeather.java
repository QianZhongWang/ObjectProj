package com.threadProj.wait.weather;

public class ReadWeather implements Runnable {
    Weather weather;

    public ReadWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        weather.read();

    }
}
