package com.hzw.school.model;

public class Student {
    // 成员属性 学号，姓名、性别、年龄
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;

    private static Subject studentSubject;

    private Subject subject;


    public Student() {
        this.studentNo = "未知";
        this.studentName = "未知";
        this.studentSex = "未知";
        this.studentAge = 0;
    }

//    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
//        this.setStudentNo(studentNo);
//        this.setStudentName(studentName);
//        this.setStudentSex(studentSex);
//        this.setStudentAge(studentAge);
//    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
    }

    public void setStudentSubject(Subject studentSubject) {
        Student.studentSubject = studentSubject;
    }

    /**
     * 获取学生的学科信息 如果没有学科信息，就创建一个新的学科信息
     *
     * @return 学科信息
     */

    public Subject getStudentSubject() {
        if (studentSubject == null) {
            studentSubject = new Subject();
        }
        return studentSubject;
    }


    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        if (studentSex.equals("男") || studentSex.equals("女")) {
            this.studentSex = studentSex;
            return;
        }
        this.studentSex = "未知";
    }

    public void setStudentAge(int studentAge) {
        if (studentAge < 10 || studentAge > 100) {
            this.studentAge = 10;
            return;
        }
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    /**
     * 学生介绍方法
     *
     * @return 自我介绍的信息，包含姓名、学号、性别、年龄
     */
    public String introduction() {
        return "学生信息如下：\n学号：" + this.getStudentNo() + "\n姓名：" + this.getStudentName() + "\n性别：" + this.getStudentSex() + "\n年龄：" + this.getStudentAge()+ "\n学科名称：" + studentSubject.getSubjectName() + "\n学科编号：" + studentSubject.getSubjectNo() + "\n学制年限：" + studentSubject.getSubjectLife() + "年";
    }


    /**
     * 学生介绍方法
     *
     * @param subjectName 学科名称
     * @param subjectNo   学科编号
     * @param subjectLife 学制年限
     * @return 自我介绍的信息，包含姓名、学号、性别、年龄、学科名称、学科编号、学制年限
     */
    public String introduction(String subjectName, String subjectNo, int subjectLife) {
        return "学生信息如下：\n学号：" + this.getStudentNo() + "\n姓名：" + this.getStudentName() + "\n性别：" + this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n学科名称：" + subjectName + "\n学科编号：" + subjectNo + "\n学制年限：" + subjectLife + "年";
    }

    /**
     * 学生介绍方法
     *
     * @param subject 学科对象
     * @return 自我介绍的信息，包含姓名、学号、性别、年龄、学科名称、学科编号、学制年限
     */
    public String introduction(Subject subject) {
        return "学生信息如下：\n学号：" + this.getStudentNo() + "\n姓名：" + this.getStudentName() + "\n性别：" + this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n学科名称：" + subject.getSubjectName() + "\n学科编号：" + subject.getSubjectNo() + "\n学制年限：" + subject.getSubjectLife() + "年";
    }


}
