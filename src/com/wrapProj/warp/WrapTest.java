package com.wrapProj.warp;

public class WrapTest {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println("one == two的结果是：" + (one == two)); // --> false

        System.out.println("====================================");

        Integer three = 100;
        System.out.println("three == 100的结果是：" + (three == 100)); // --> true
        Integer four = 100;
        System.out.println("three == four的结果是：" + (three == four)); // --> true
        Integer five = 200;
        System.out.println("five == 200的结果是：" + (five == 200)); // --> true
        Integer six = 200;
        System.out.println("five == six的结果是：" + (five == six)); // --> false


        Integer seven = 128;
        System.out.println("seven == 128的结果是" + (seven == 128));
        Integer eight = 128;
        System.out.println("eight== seven的结果是：" + (eight == seven));

        Integer nine = 127;
        Integer ten = 127;
        System.out.println("nine == ten的结果是：" + (nine == ten));


    }
}
