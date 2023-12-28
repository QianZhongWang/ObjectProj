package com.string;

import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {
        String str = "JAVA 编程 基础";
        // 将字符串转换为byte数组，并输出
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        String str1 = new String(bytes);
        System.out.println(str1);
    }
}
