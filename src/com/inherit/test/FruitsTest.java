package com.inherit.test;

import com.inherit.fruits.Banana;
import com.inherit.fruits.Fruits;
import com.inherit.fruits.Waxberry;

public class FruitsTest {
    public static void main(String[] args) {
        // 实例化两个父类对象，传入两组相同的参数值
        Fruits f1 = new Fruits("圆形", "甜");
        Fruits f2 = new Fruits("圆形", "甜");
        // 调用父类eat方法
        f1.eat();
        // 测试重写的equals方法，判断两个对象是否相等
        System.out.println("f1和f2的引用比较：" + f1.equals(f2));

        System.out.println("---------------------------------");
        // 实例化子类对象，并传入相关参数
        Waxberry w1 = new Waxberry("圆形", "酸甜适中", "紫红色");
        // 调用子类face方法和eat方法
        w1.face();
        w1.eat();
        // 输出toString方法的返回值
        System.out.println(w1.toString());

        System.out.println("---------------------------------");
        // 实例化Banana对象，并传入相关参数
        Banana b = new Banana("短而稍微弯曲", "甜", "仙人蕉");
        // 调用advantage方法和重载后的advantage方法
        b.advantage();
        b.advantage("黄色");



    }
}
