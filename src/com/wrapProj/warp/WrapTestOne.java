package com.wrapProj.warp;

public class WrapTestOne {
    public static void main(String[] args) {
        /*
         * 装箱：把基本数据类型转换为对应的包装类对象
         * 1.自动装箱
         */
        int i = 10;
        Integer i1 = i;
        System.out.println(i1);
        // 手动装箱
        Integer i2 = new Integer(i);
        System.out.println(i2);
        System.out.println((i1.equals(i2)) + " " + (i1 == i2));

        System.out.println("====================================");

        /*
         * 拆箱：把包装类对象转换为对应的基本数据类型
         * 1.自动拆箱
         */
        Integer i3 = 20;
        int i4 = i3;
        System.out.println(i4);
        // 手动拆箱
        int i5 = i3.intValue();
        System.out.println(i5);
        System.out.println((i3.equals(i4)) + " " + (i3 == i4));
        double d1 = i3.doubleValue();
        System.out.println(d1);



        int score  = 100;
        Integer score1 = score;
        System.out.println(score1);
        double score2 = score1.doubleValue();
        System.out.println(score2);
        long score3 = score1.longValue();
        System.out.println(score3);
        int score4 = score1.intValue();
        System.out.println(score4);


    }
}
