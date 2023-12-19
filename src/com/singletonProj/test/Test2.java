package com.singletonProj.test;

import com.singletonProj.Singleton.Emperor;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("创建1号皇帝对象");
        Emperor one = Emperor.getInstance();
        System.out.println("创建2号皇帝对象");
        Emperor two = Emperor.getInstance();
        System.out.println("创建3号皇帝对象");
        Emperor there = Emperor.getInstance();
        System.out.println("三个皇帝对象依次是：");
        System.out.println(one);
        System.out.println(two);
        System.out.println(there);
    }
}
