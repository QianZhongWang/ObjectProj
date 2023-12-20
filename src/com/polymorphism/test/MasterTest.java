package com.polymorphism.test;

import com.polymorphism.animal.Animal;
import com.polymorphism.animal.Cat;
import com.polymorphism.animal.Dog;
import com.polymorphism.animal.Master;

public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        master.feed(dog);
        master.feed(cat);

        master.feed(cat1);
        master.feed(dog1);
    }
}
