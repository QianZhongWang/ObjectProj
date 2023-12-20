package com.class1.model.inter;

public interface IOuterface {
    // 常量TEMP 100；
    public static int TEMP = 100;

    // 抽象方法abfMethod
    public abstract void abfMethod();

    //默认方法defMethod
    default void defMethod() {
        System.out.println("IOuterface的默认方法defMethod");
    }

    static void staMethod() {
        System.out.println("IOuterface的静态方法staMethod");
    }

    /**
     * 接口中定义的普通成员内部类
     */
    public class InnerClass {
        public void show() {
            System.out.println("接口中定义的普通成员内部类");
        }
    }

    /**
     * 抽象内部类
     */
    public abstract class AbInnerClass {
        public abstract void abInfo();

        public void info() {
            System.out.println("接口中可定义抽象成员内部类");
        }
    }

}
