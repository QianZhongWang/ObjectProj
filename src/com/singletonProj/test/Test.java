package com.singletonProj.test;

import com.singletonProj.Singleton.SingletonOne;
import com.singletonProj.Singleton.SingletonTwo;

public class Test {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one == two);
        System.out.println(one);
        System.out.println(two);

        System.out.println("---------------------------");

        SingletonTwo there = SingletonTwo.getInstance();
        SingletonTwo four = SingletonTwo.getInstance();
        System.out.println(there == four);
        System.out.println(there);
        System.out.println(four);


    }
}
