package com.collection.hashSet.animal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("花花", 2, "英国短毛猫");
        Cat cat2 = new Cat("凡凡", 1, "中华田园猫");
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);

        System.out.println("共计有" + set.size() + "只猫咪，它们分别是：");
        for (Cat cat : set) {
            System.out.println("名字：" + cat.getName() + "，年龄: " + cat.getMonth() + "，品种: " + cat.getSpecies());
        }

        System.out.println("===================================");
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            Cat cat = it.next();
            System.out.println("名字：" + cat.getName() + "，年龄: " + cat.getMonth() + "，品种: " + cat.getSpecies());
        }

        System.out.println("===================================");
        it = set.iterator();// 重新获取迭代器 从头开始遍历 必须重新获取迭代器
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // hashCode()和equals()方法的重写 重写后add方法就不能添加cat3
        System.out.println("===================================");
        Cat cat3 = new Cat("花花", 2, "英国短毛猫");
        set.add(cat3);
        System.out.println(set);

        Cat cat4 = new Cat("花花二代", 2, "英国短毛猫");
        set.add(cat4);
        System.out.println(set);

        // 在集合中查找花花的信息并输出
        System.out.println("===================================");
        it = set.iterator();
        while (it.hasNext()) {
            Cat cat = it.next();
            if (cat.getName().equals("花花")) {
                System.out.println("花花找到了");
                System.out.println(cat);
                break;
            }
        }
        // 通过对象去查找
        System.out.println("===================================");
        if (set.contains(cat1)) {
            System.out.println("花花找到了");
            System.out.println(cat1);
        } else {
            System.out.println("花花没找到");
        }

    }
}
