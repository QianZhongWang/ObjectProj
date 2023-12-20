package com.zoo.test;

import com.zoo.model.*;

import java.util.Scanner;

public class AnimalTest {

    public static void hello() {
        System.out.println("*****************欢迎来到太阳马戏团******************");
        System.out.println("*****************请选择表演则***********************");
        System.out.println("*****************1.棕熊表演*************************");
        System.out.println("*****************2.狮子表演*************************");
        System.out.println("*****************3.猴子表演*************************");
        System.out.println("*****************4.鹦鹉表演*************************");
        System.out.println("*****************5.小丑表演*************************");
    }

    public static boolean IsContinue() {
        int flag = -1;
        Scanner sc = new Scanner(System.in);
        while (flag != 1 && flag != 0) {
            System.out.println("**********是否继续观看(1/0)**************");
            try {
                flag = sc.nextInt();
            } catch (Exception e) {
                System.out.println("输入信息不正确请重新输入");
                sc.next();
            }
        }
        return flag != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choice;
        while (flag) {
            hello();
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入");
                sc.next();
                continue;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("你选择的表演暂未开放，请重新选择");
                continue;
            }
            switch (choice) {
                case 1:
                    new Bear("Bill", 1).act();
                    break;
                case 2:
                    new Lion("Lain", 2, "灰色", "公").act();
                    break;
                case 3:
                    new Monkey("Tom", 1, "金丝猴").act();
                    break;
                case 4:
                    new Parrot("Rose", 1, "牡丹杜鹃").act();
                    break;
                case 5:
                    new Clown("Kahle", 5).act();
                    break;
                default:
                    System.out.println("输入参数有误请重新输入");

            }
            flag = AnimalTest.IsContinue();

        }


    }
}
