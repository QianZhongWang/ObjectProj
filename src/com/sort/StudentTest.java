package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest implements Comparator<Student> {
    // 实现接口中的方法
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
    //
    public static void main(String[] args) {
        // 定义Student类的对象
        Student s1 = new Student(40, "peter", 20);
        Student s2 = new Student(28, "angel", 5);
        Student s3 = new Student(35, "tom", 18);
        List<Student> list = new ArrayList<Student>();
        // 将对象添加到List中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 输出排序前的数据
        System.out.println("排序前：");
        for (Student student : list) {
            System.out.println(student);
        }
        // 排序
        Collections.sort(list,new StudentTest());
        // 输出排序后的数据
        System.out.println("按名字升序排序后：");
        for (Student student : list) {
            System.out.println(student);
        }


    }
}
