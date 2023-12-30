package com.collection.hashSet.student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Mike", 90);
        Student stu2 = new Student(2, "Jack", 95);
        Student stu3 = new Student(3, "Lucy", 92);

        Set<Student> students = new HashSet<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        System.out.println("Set集合中的元素为：");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println("[学号：" + student.getStuId() + ",姓名：" + student.getName() + ",成绩：" + student.getScore() + "]");
        }

        Student stu4 = new Student(3, "Lucy", 92);
        students.add(stu4);
        System.out.println("添加重复元素后Set集合中的元素为：");
        Iterator<Student> it2 = students.iterator();
        while (it2.hasNext()) {
            Student student = (Student) it2.next();
            System.out.println("[学号：" + student.getStuId() + ",姓名：" + student.getName() + ",成绩：" + student.getScore() + "]");
        }
    }
}
