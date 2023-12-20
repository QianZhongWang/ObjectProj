package com.interface1;

public interface IFly {
    // 飞行能力
    void fly();

    default void fly2() {
        System.out.println("fly2");
    }

    static void fly3() {
        System.out.println("fly3");
    }
}
