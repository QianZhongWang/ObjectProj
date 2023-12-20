package com.polymorphism.animal;

public class Master {
    /*
     * 喂宠物：
     * 喂猫猫：吃完东西后，主人会带它去玩线球
     * 喂狗狗：吃完东西后，主人会带狗狗去睡觉
     */
    public void feed(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {
            ((Cat) animal).playBall();
        }
        if (animal instanceof Dog) {
            ((Dog) animal).sleep();
        }


    }
}
