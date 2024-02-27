package com.threadProj.wait.weather;

public class Weather {
    int temperature; // 温度
    int humidity; // 湿度
    boolean flag = false; // 是否有数据

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


    public synchronized void generate() {
        if (this.flag) { // 当有数据时，等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setTemperature((int) (Math.random() * 40));
        this.setHumidity((int) (Math.random() * 100));
        System.out.println("生成天气数据：" + this.toString());
        this.flag = true;
        notifyAll();
    }

    public synchronized void read() {
        if (!this.flag) { // 当没有数据时，等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据：" + this.toString());
        this.flag = false;
        notifyAll();
    }

    @Override
    public String toString() {
        return "天气数据:[温度=" + temperature + ", 湿度=" + humidity + "]";
    }
}
