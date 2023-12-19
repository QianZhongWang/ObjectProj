package com.singletonProj.test;

import com.singletonProj.Singleton.Earth;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("第一个地球创建中。。。");
        Earth one = Earth.getInstance();
        System.out.println("第二个地球创建中。。。");
        Earth two = Earth.getInstance();
        System.out.println("第三个地球创建中。。。");
        Earth there = Earth.getInstance();
        System.out.println("三个地球是同一个地球吗？");
        System.out.println(one);
        System.out.println(two);
        System.out.println(there);
    }
}
