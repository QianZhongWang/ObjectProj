package com.hzw.school.test;

import com.hzw.school.model.Subject;
import com.hzw.school.model.Student;

public class SchoolTest {
    public static void main(String[] args) {
        //测试学科类
        Subject subject = new Subject("计算机科学与技术", "J0001", 4);
        System.out.println(subject.info());
        System.out.println("====================================");

        //测试学生类
        Student student1 = new Student("S001", "张三", "男", 200, subject);
        System.out.println(student1.introduction());
        System.out.println("====================================");

        Student student2 = new Student("S002", "李四", "男", 20, subject);
        System.out.println(student2.introduction("计算机科学与技术", "J0001", 4));
        System.out.println("====================================");

        Student student3 = new Student("S003", "王五", "男", 20, subject);
        System.out.println(student3.introduction(subject));
        System.out.println("====================================");

        Student student4 = new Student("S004", "赵六", "男", 20, subject);
        System.out.println(student4.introduction());

        // 测试指定专业中到底有多少学生
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        System.out.println(subject.getSubjectName() + "的专业中已有" + subject.getStudentNum() + "名学生");


    }
}
