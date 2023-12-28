package com.string;

public class StringDemo5 {
    public static void main(String[] args) {
        /*
         * String的不可变性
         * String对象一旦被创建，则不能修改，是不可变的
         * 所谓的修改其实是创建新对象，所指向的内存空间不变
         */
        String s1 = "imooc";
        s1 = "hello," + s1;
        System.out.println(s1);
    }
}
