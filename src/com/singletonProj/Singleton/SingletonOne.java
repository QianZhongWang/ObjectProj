package com.singletonProj.Singleton;
// 饿汉式：创建对象实例的时候直接初始化  空间换时间

public class SingletonOne {
    // 创建类中的私有构造
    SingletonOne() {

    }

    // 创建该类型的私有静态实例
    private static SingletonOne instance = new SingletonOne();

    public static SingletonOne getInstance() {
        return instance;
    }
}
