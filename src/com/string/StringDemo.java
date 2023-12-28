package com.string;

public class StringDemo {
    public static void main(String[] args) {
        String str = "JAVA 编程 基础";
        System.out.println("字符串str的长度是：" + str.length());
        // 输出程
        System.out.println("字符串str中索引为6的字符是：" + str.charAt(6));
        // 取出子串“编程 基础”并输出
        System.out.println(str.substring(5));
        // 取出子串“编程”并输出
        System.out.println(str.substring(5, 7));// 前面保卫

        System.out.println("---------------------------------------");

        String str1 = "Hello,Imooc!";
        str1 = str1.substring(2, 5);
        System.out.println(str1);
        char ch = str1.charAt(str1.length() -1);
        System.out.println(ch);

    }

}
