package com.sort.treeSet;

import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("001","luck",18);
        Person p2 = new Person("002","Mike",20);
        Person p3 = new Person("003","Jack",17);
        Person p4 = new Person("004","Marker",19);
        Person p5 = new Person("005","Bill",21);
        TreeSet<Person> personSet = new TreeSet<Person>(new PersonComparator());
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        System.out.println("显示集合所有元素：");
        for (Person p : personSet) {
            System.out.println(p);
        }
        System.out.println("检索并删除集合的第一个元素：" );
        // pollFirst()检索并删除集合第一个元素，如果集合为空返回null
        System.out.println(personSet.pollFirst());
        System.out.println("显示集合所有元素：");
        for (Person p : personSet) {
            System.out.println(p);
        }

    }
}
