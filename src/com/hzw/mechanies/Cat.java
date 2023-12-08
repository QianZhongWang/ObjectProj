package com.hzw.mechanies;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat() {
        this.name = "未知";
        this.age = 0;
        this.color = "未知";
    }

    public Cat(String name, int age, String color) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("年龄不能为负数");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void eat() {
        System.out.println(this.name + "在吃鱼");
    }

    public void sleep() {
        System.out.println(this.name + "在睡觉");
    }

    public void catchMouse() {
        System.out.println(this.name + "在抓老鼠");
    }
}
