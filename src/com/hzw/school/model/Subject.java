package com.hzw.school.model;

public class Subject {
    // 成员属性 学科名称、学科编号、学制年限 报名选修的学生信息
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] myStudents;
    private int studentNum;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    /**
     * 设置学制年限必须大于0
     *
     * @param subjectLife 学制年限
     */
    public void setSubjectLife(int subjectLife) {
        if (subjectLife < 0) {
            System.out.println("学制年限不能为负数");
            return;
        }
        this.subjectLife = subjectLife;
    }

    /**
     * 获取选修专业学生信息，如果学生信息的数组未被初始化，则先初始化长度200
     *
     * @return 保存学生信息的数组
     */
    public Student[] getMyStudents() {
        if (this.myStudents == null) {
            this.myStudents = new Student[200];
        }
        return this.myStudents;
    }

    public void setMyStudents(Student[] students) {
        this.myStudents = students;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int num) {
        this.studentNum = num;
    }

    /**
     * 专业介绍方法
     *
     * @return 返回专业介绍的方法，包括学科，学科编号，学制
     */
    public String info() {
        return "学科信息如下：\n学科名称：" + this.getSubjectName() + "\n学科编号：" + this.getSubjectNo() + "\n学制年限：" + this.getSubjectLife() + "年";
    }

    public Subject() {
        this.subjectName = "未知";
        this.subjectNo = "未知";
        this.subjectLife = 0;
    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
        this.setMyStudents(myStudents);
    }

    public void addStudent(Student stu) {
        /*
         * 1  将学生保存到数组中
         * 2 将学生个数保存到studentNum
         */
        for (int i = 0; i < this.getMyStudents().length; i++) {
            if (this.getMyStudents()[i] == null) {
                stu.setStudentSubject(this);
                this.getMyStudents()[i] = stu;
                this.studentNum = i + 1;
                return;
            }
        }


    }

}
