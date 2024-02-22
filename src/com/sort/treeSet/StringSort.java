package com.sort.treeSet;

import java.util.TreeSet;

public class StringSort {
    public static void main(String[] args) {
        // 创建TreeSet对象，泛型为String
        TreeSet<String> strSet = new TreeSet<String>();
        // 为strSet添加元素
        strSet.add("java");
        strSet.add("Python");
        strSet.add("C++");
        strSet.add("JavaScript");
        // 输出strSet结合
        for (String str : strSet) {
            System.out.print(str+ " ");
        }
        System.out.println();
        // 返回集合中第一个元素，默认按升序排序最小元素
        System.out.println("First element: " + strSet.first());
        // 返回集合中最后一个元素，默认按升序排序最大元素
        System.out.println("Last element: " + strSet.last());

    }
}
