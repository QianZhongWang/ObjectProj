package com.collection.arrayList;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Go");
        list.add("Swift");
        list.add("JavaScript");

        // 输出集合中的个数
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("************************------------ ");
        for (String s : list) {
            System.out.print(s + ", ");
        }
        System.out.println();
        // 移除列表中的的C++
//        list.remove(2);
        list.remove("c++");
        System.out.println(list);

        // 判断列表中是否包含Java
        System.out.println(list.contains("Java"));


    }
}
