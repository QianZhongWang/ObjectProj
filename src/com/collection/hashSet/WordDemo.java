package com.collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {
    public static void main(String[] args) {
//        String str = "If you want to change your fate I think you must come to the dark horse to learn java";
//        Set<String> set = new HashSet<>();
//        String[] strArray = str.split(" ");
//        System.out.println(Arrays.toString(strArray));
//        for (String s : strArray) {
//            set.add(s);
//        }
//        System.out.println("不重复的单词有：");
//        for (String s : set) {
//            System.out.print(s + " ");
//        }

        Set<String> hashSet = new HashSet<>();
        hashSet.add("blue");
        hashSet.add("red");
        hashSet.add("black");
        hashSet.add("yellow");
        hashSet.add("white");
        System.out.println("集合中的元素为：" + hashSet);
        // 遍历迭代器并输出元素
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // 遍历集合并输出元素
        for (String s : hashSet) {
            System.out.print(s + " ");
        }
        System.out.println();
        // 使用toArray()方法把集合转换为数组
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.print(hashSet.toArray()[i] + " ");
        }
        System.out.println();


        // 添加重复的元素
        hashSet.add("blue");
        System.out.println("集合中的元素为：" + hashSet);

    }
}
