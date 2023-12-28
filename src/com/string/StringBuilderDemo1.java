package com.string;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好");
        str.append(",imooc");
        System.out.println(str);

//        System.out.println(str.append(",").append("imooc"));
        // 将字符串变成 你好，IMOOC
        System.out.println(str.delete(3, 9).append("IMOOC"));

        System.out.println(str.replace(3, 9, "imooc"));

        System.out.println(str.substring(0, 2));// 并不会改变str
        System.out.println(str);

        System.out.println("---------------------------------------");
        StringBuilder str2 = new StringBuilder("abcdefg");
        System.out.println(str2.delete(2,4));
        System.out.println(str2.insert(3,"CD"));


    }
}
