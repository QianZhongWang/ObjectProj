package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    // 对存放在List中的字符型数据进行排序
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("blue");
        list.add("yellow");
        list.add("gray");
        System.out.println("排序前：");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
//        list.sort((o1, o2) -> o1.compareTo(o2));
        Collections.sort(list);
        System.out.println("排序后：");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
