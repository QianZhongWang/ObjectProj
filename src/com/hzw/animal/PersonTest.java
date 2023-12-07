package com.hzw.animal;

public class PersonTest {
    public static void main(String[] args) {
        Person liming = new Person();
        liming.name = "李明";
        liming.age = 10;
        liming.grade = "五年级了";
        liming.student();
        liming.sex("男");
        liming.mySelf();
    }
}
