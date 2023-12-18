package com.inherit.nonMotor;

public class NonMotor {
    // 私有属性 品牌，颜色，轮子默认两个 座椅默认一个
    private String brand;
    private String color;
    private int wheel = 2;
    private int seat = 1;


    public NonMotor() {
    }

    public NonMotor(String brand, String color, int wheel, int seat) {
        this.setBrand(brand);
        this.setColor(color);
        this.setWheel(wheel);
        this.setSeat(seat);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * 运行方法：描述内容为，这是一辆**颜色的，**牌的非机动车，有**个轮子，有**个座位
     *
     * @return 车辆的描述内容
     */
    public String work() {
        return "这是一辆"+ this.getColor()+"颜色的，"+ this.getBrand()+"牌的非机动车，有"+ this.getWheel()+"个轮子，有"+ this.getSeat()+"个座位";

    }
}
