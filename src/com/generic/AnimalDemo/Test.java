package com.generic.AnimalDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("巴蒂");
        Dog dog2 = new Dog("豆豆");
        Cat cat1 = new Cat("花花");
        Cat cat2 = new Cat("凡凡");

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);

        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.play(cats);
        animalPlay.play(dogs);

    }
}
