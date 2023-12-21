package com.wrapProj.warp;

public class WrapTestTwo {
    public static void main(String[] args) {
        int i = 10;
        // 基本数据类型转换为字符串
        String s1 = Integer.toString(i);
        System.out.println("int 类型转换为String类型对象s1 = " + s1);
        System.out.println("====================================");
        // 字符串转换为基本数据类型
        // 1.包装类的parseXxx(String s)静态方法
        int t3 = Integer.parseInt(s1);
        System.out.println("String类型对象转换为int类型t3 = " + t3);
        // 2.包装类的valueOf(String s)静态方法 先将字符串转换为包装类，再通过自动拆箱转换为基本数据类型
        int t4 = Integer.valueOf(s1);
        System.out.println("String类型对象转换为Integer类型t4 = " + t4);
    }
}
