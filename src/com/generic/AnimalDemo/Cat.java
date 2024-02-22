package com.generic.AnimalDemo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("小猫" + getName() + "在玩耍");
    }
}
