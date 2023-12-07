package com.hzw.animal;

/**
 * 宠物猫类
 */
public class Cat1 {
    // 昵称 String类型默认值null
    String name;
    // 年龄 int类型默认值0
    int month;
    // 体重 double类型默认值0.0
    double weight;
    // 品种
    String species;

    public Cat1() {
        System.out.println("我是无参构造方法");
    }

    public Cat1(String name) {
        this();//只能放在第一行
        System.out.println("我是带参构造方法");
    }

    public Cat1(String name, int month, double weight, String species) {
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
    }

    /**
     * 跑动的方法
     */
    public void run() {
        System.out.println("小猫快跑！");
    }

    /**
     * 跑动的重载防范
     *
     * @param name 猫的名字
     */
    public void run(String name) {
        System.out.println(name + "快跑！");
    }

    /**
     * 吃东西的方法
     */
    public void eat() {
        System.out.println("小猫吃鱼！");
    }

}
