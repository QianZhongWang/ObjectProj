package com.inherit.animal;

public class Animal {
    private String name; // 昵称
    private int age;  // 月份
    private String species; // 品种

    public Animal() {
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public void eat() {
        System.out.println(this.getName() + "吃东西");
    }

    public void eat(String name) {
        System.out.println(name + "吃东西");
    }

    public void jump() {
        System.out.println("动物跳跃是一种本能");
    }
}
