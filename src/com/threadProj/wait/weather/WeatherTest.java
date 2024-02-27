package com.threadProj.wait.weather;

public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        GenerateWeather writeWeather = new GenerateWeather(weather);
        ReadWeather readWeather = new ReadWeather(weather);
        Thread t1 = new Thread(writeWeather);
        Thread t2 = new Thread(readWeather);
        t1.start();
        t2.start();
    }
}
