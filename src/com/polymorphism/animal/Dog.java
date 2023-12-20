package com.polymorphism.animal;

public class Dog extends Animal {
    // 属性：性别
    private String Sex;

    public Dog() {
    }

    public Dog(String name, int age, String sex) {
        super(name, age);
        this.setSex(sex);
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    // 方法 睡觉
    public void sleep() {
        System.out.println("小狗在睡觉");
    }

    // 方法：吃东西 （重写父类方法—)

    @Override
    public void eat() {
        System.out.println("狗吃肉~~~");
    }
}
