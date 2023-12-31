package com.zoo.model;

public class Parrot extends Animal implements IAct {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Parrot() {
    }

    public Parrot(String name, int age, String type) {
        super(name, age);
        this.setType(type);
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃坚果和松子");
    }

    @Override
    public void skill() {
        System.out.println("技能：擅长模仿");
    }

    @Override
    public void act() {
        System.out.println("表演者：" + this.getName());
        System.out.println("年龄：" + this.getAge() + "岁");
        System.out.println("品种：" + this.getType());
        this.skill();
        this.love();

    }
}
