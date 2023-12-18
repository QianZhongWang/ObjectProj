package com.inherit.nonMotor;

public class Bicycle extends NonMotor {
    public Bicycle() {
    }

    public Bicycle(String brand, String color, int wheel, int seat) {
        super(brand, color, wheel, seat);
    }

    public String work() {
        return "这是一辆" + this.getColor() + "颜色的，" + this.getBrand() + "牌的自行车，";
    }
}
