package com.polymorphism.animal;

public class Cat extends Animal {
    // 属性体重
    private int weight;

    public Cat() {
    }

    public Cat(String name, int age, int weight) {
        super(name, age);
        this.setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // 方法跑动
    public void run() {
        System.out.println("小猫快跑");
    }

    // 重写：吃东西的方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼~~~~");
    }

    public void playBall() {
        System.out.println("玩线球");
    }
}
