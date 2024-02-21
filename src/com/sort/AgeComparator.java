package com.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        // 按照年龄进行降序排序
        return o2.getAge() - o1.getAge();
    }
}
