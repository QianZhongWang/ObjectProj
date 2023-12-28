package com.string;

public class StringDemoTwo {
    public static void main(String[] args) {
        String str = new String("JAVA编程基础，我喜欢java编程");
        int strAIndex = str.indexOf('A');
        System.out.println("字符'A'在字符串中第一次出现的位置是：" + strAIndex);
        int codeIndex = str.indexOf("编程");
        System.out.println("子串\"编程\"第一次在字符串出现的位置是： " + codeIndex);

        strAIndex = str.lastIndexOf("A");
        System.out.println("字符'A'在字符串中最后次出现的位置是：" + strAIndex);
        codeIndex = str.indexOf("编程");
        System.out.println("子串\"编程\"最后一次在字符串出现的位置是： " + codeIndex);


        String str3 = "abcdefg";
        str3 = str3.substring(2, 5);
        System.out.println(str3);
        str3 = str3.toUpperCase();
        System.out.println(str3);
        str3 = str3.replace("DE", "MM");
        System.out.println(str3);
    }
}
