package com.inherit.car;

public final class HomeCar extends Car {
    // 私有属性：载客量（num）
    private int num;

    public HomeCar() {

    }

    public HomeCar(String color, String userName, int num) {
        super(color, userName);
        this.setNum(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public void display() {
        System.out.println(this.getUserName() + "拥有一辆" + this.getColor() + "颜色的载客量为" + this.getNum() + "人的私家车");
    }

    public void display(int num) {
        System.out.println("家用汽车大多有" + num + "个座位");
    }
}
