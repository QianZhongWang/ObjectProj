package com.singletonProj.Singleton;

// 懒汉式：类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才完成初始操作 时间换空间
public class SingletonTwo {
    // 创建私有构造方法
    private SingletonTwo() {
        System.out.println("SingletonTwo被实例化了,我是懒汉式单例模式");
    }

    // 创建静态的该类的实例对象
    private static SingletonTwo instance = null;

    // 创建开放的静态方法提供实例对象
    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
