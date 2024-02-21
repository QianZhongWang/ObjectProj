package com.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);

        // 按照名字的字典顺序进行排序
//        return o1.getName().compareTo(o2.getName());
    }
}
