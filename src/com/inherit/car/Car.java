package com.inherit.car;

public class Car {
    // 私有属性 车的颜色（color）和车主姓名（userName）
    private String color;
    private String userName;

    public Car() {
    }

    public Car(String color, String userName) {
        this.setColor(color);
        this.setUserName(userName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void use() {
        System.out.println("我是机动车！");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        // 在强制类型转换前，先使用instanceof运算符判断是否为Car类的实例
        if (!(obj instanceof Car)) {
            return false;
        }
        Car temp = (Car) obj;
        return this.getColor().equals(temp.getColor()) && this.getUserName().equals(temp.getUserName());
    }
}
