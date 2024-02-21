package com.sort;



public class Employee implements Comparable<Employee> {
    // 三个成员变量 编号、姓名、工资
    private String id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(String id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[编号：" + id + ", 姓名：" + name + ", 工资：" + salary + "]";
    }

    @Override
    public int compareTo( Employee o) {
        float salary1 = this.getSalary();
        float salary2 = o.getSalary();
        int n = new Float(salary2 - salary1).intValue();
        return n;
    }
}
