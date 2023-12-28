package com.string;

public class StringBuilderDemo1Test {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("欢迎来到");
        System.out.println(str);
        str.append("imooc");
        System.out.println(str);
        str.delete(0, 4).insert(0, "你好!");
        System.out.println(str);
        str.replace(0, 3, "你好，");
        System.out.println(str);

    }
}
