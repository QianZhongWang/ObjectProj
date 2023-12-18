package com.inherit.nonMotor;

public class ElectricCar extends NonMotor {
    // 电池品牌
    private String batteryBrand;

    public ElectricCar() {
    }

    public ElectricCar(String brand, String color, int wheel, int seat, String batteryBrand) {
        super(brand, color, wheel, seat);
        this.setBatteryBrand(batteryBrand);
    }

    public String getBatteryBrand() {
        return batteryBrand;
    }

    public void setBatteryBrand(String batteryBrand) {
        this.batteryBrand = batteryBrand;
    }

    public String work(){
        return "这是一辆使用"+this.getBatteryBrand()+"牌电池的，电动车";
    }
}

