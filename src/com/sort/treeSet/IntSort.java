package com.sort.treeSet;

import java.util.TreeSet;

public class IntSort {
    public static void main(String[] args) {
        // 创建TreeSet对象，泛型为Integer
        TreeSet<Integer> intSet = new TreeSet<Integer>();
        // 为intSet添加元素
        intSet.add(10);
        intSet.add(5);
        intSet.add(8);
        intSet.add(-1);
        // 输出intSet的值
        System.out.println("intSet集合的值为：" );
        for(Integer i:intSet) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 集合中最大的元素小于或等于给定元素，如果没有返回null
        System.out.println("等于该元素的情况：" + intSet.floor(10));
        System.out.println("小于该元素的情况：" + intSet.floor(2));
        System.out.println("没有符合要求元素的情况："+ intSet.floor(-2));

    }
}
