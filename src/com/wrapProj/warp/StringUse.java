package com.wrapProj.warp;

public class StringUse {
    public static void main(String[] args) {
        double d = 12.5;
        String s = Double.toString(d);
        System.out.println("d转换为String类型后+10的结果为： " + (s + 10));
        String str = "2.8";
        double d1 = Double.parseDouble(str);
        System.out.println("str转换为double类型后+10的结果为： " + (d1 + 10));
        double d2 = Double.valueOf(str);
        System.out.println("str转换为Double类型后+10的结果为： " + (d2 + 10));
    }
}
