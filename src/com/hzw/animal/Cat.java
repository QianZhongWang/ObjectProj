package com.hzw.animal;

/**
 * 宠物猫类
 */
public class Cat {
    // 昵称 String类型默认值null
    String name;
    // 年龄 int类型默认值0
    int month;
    // 体重 double类型默认值0.0
    double weight;
    // 品种
    String species;

    /**
     * 跑动的方法
     */
    public void run() {
        System.out.println("小猫快跑！");
    }

    /**
     * 吃东西的方法
     */
    public void eat() {
        System.out.println("小猫吃鱼！");
    }

}
