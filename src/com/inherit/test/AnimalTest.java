package com.inherit.test;

import com.inherit.animal.Cat;
import com.inherit.animal.Dog;

// 子类可以直接访问父类的非私有成员

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("小花");
        cat.setAge(2);
        cat.setSpecies("英国短毛猫");
        cat.setWeight(2.3);
        cat.eat();
        cat.run();

        Dog dog = new Dog();
        dog.setName("小黑");
        dog.setAge(3);
        dog.setSpecies("哈士奇");
        dog.setSex("公");
        dog.eat();
        dog.sleep();

        System.out.println("++++++++++++++++++++++++++");
        dog.eat("大黄");
    }

}
