package com.generic.AnimalDemo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("小狗" + super.getName() + "在玩飞盘");
    }
}
