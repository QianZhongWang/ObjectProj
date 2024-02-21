package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {
        // 按名字升序对猫进行排序
        Cat huahua = new Cat("huahua", 3, "英国短毛猫");
        Cat fanfan = new Cat("fanfan", 2, "中华田园猫");
        Cat mimi = new Cat("mimi", 1, "中华田园猫");
        List<Cat> catList = new ArrayList<Cat>();

        catList.add(huahua);
        catList.add(fanfan);
        catList.add(mimi);

        System.out.println("排序前：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }
        System.out.println("按名字升序排序后：");
        Collections.sort(catList, new NameComparator());
//        catList.sort(new NameComparator());

        for (Cat cat : catList) {
            System.out.println(cat);
        }


        Collections.sort(catList,new AgeComparator());
        System.out.println("按年龄降序排序后：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }

    }
}
