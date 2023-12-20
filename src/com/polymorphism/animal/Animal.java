package com.polymorphism.animal;

public class Animal {
    //  属性：昵称，年龄
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat() {
        System.out.println("动物都有吃东西的能力");
    }
}
