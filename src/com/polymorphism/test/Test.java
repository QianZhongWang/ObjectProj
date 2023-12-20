package com.polymorphism.test;

import com.polymorphism.animal.Animal;
import com.polymorphism.animal.Cat;
import com.polymorphism.animal.Dog;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal(); // 1
        /*
         * 向上转型、隐式转型、自动转型
         * 父类引用指向子类实例，可以调用子类重写父类的方法以及父类派生的方法，无法调用子类特有的方法
         */

        Animal two = new Cat(); // 2
        Animal there = new Dog(); // 3
        one.eat();
        two.eat();
        there.eat();

        System.out.println("------------------------------");
        /*
         * 向下转型、强制类型转换
         * 子类引用指向父类对象，此处必须进行强转，可以调用之类的所有方法
         * 必须满足转换条件，才能进行强转
         * instanceof 判断左边的对象是否是右边对象的实例 返回true、false
         */
//        Cat temp = (Cat) two;
//        temp.eat();
//        temp.run();
//        temp.getAge();

        if (two instanceof Cat) {
            Cat temp = (Cat) two;
            temp.eat();
            temp.run();
        }


//        Dog temp1 = (Dog) two;
//        temp1.eat();
//        temp1.sleep();


//        Dog temp2 = (Dog) one;
//        temp2.eat();
//        temp2.sleep();


    }
}
