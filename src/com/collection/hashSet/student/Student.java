package com.collection.hashSet.student;

public class Student {
    private int stuId;
    private String name;
    private float score;

    public Student() {
    }

    public Student(int stuId, String name, float score) {
        this.setStuId(stuId);
        this.setName(name);
        this.setScore(score);
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[学号：" + this.getStuId() + ",姓名：" + this.getName() + ",成绩：" + this.getScore() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj.getClass() == Student.class) {
            Student stu = (Student) obj;
            return stu.getStuId() == this.getStuId() && stu.getName().equals(this.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime + result + stuId;
        result = prime + result + ((name == null) ? 0 : name.hashCode());
        result = prime + result + (int) score;
        return result;
    }
}
