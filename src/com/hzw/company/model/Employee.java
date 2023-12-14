package com.hzw.company.model;

public class Employee {
    // 姓名，工号，年龄，性别，所属部门，职务信息
    private String employeeName;
    private String employeeId;
    private int employeeAge;
    private String employeeSex;
    private Department department;
    private Position position;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName == null || employeeName.trim().isEmpty()) {
            System.out.println("姓名不能为空");
            return;
        }
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.trim().isEmpty()) {
            System.out.println("工号不能为空");
            return;
        }
        this.employeeId = employeeId;
    }


    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        if (employeeAge < 0 || employeeAge > 150) {
            System.out.println("年龄不合法");
            return;
        }
        this.employeeAge = employeeAge;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        if (employeeSex == null || employeeSex.trim().isEmpty()) {
            System.out.println("性别不能为空");
            return;
        }
        if (!employeeSex.equals("男") && !employeeSex.equals("女")) {
            System.out.println("性别不合法");
            return;
        }
        this.employeeSex = employeeSex;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (department == null) {
            System.out.println("部门不能为空");
            return;
        }
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        if (position == null) {
            System.out.println("职务不能为空");
            return;
        }
        this.position = position;
    }


    public Employee() {

    }

    public Employee(String employeeName, String employeeId, int employeeAge, String employeeSex) {
        this.setEmployeeName(employeeName);
        this.setEmployeeId(employeeId);
        this.setEmployeeAge(employeeAge);
        this.setEmployeeSex(employeeSex);
    }

    public Employee(String employeeName, String employeeId, int employeeAge, String employeeSex, Department department, Position position) {
        this.setEmployeeName(employeeName);
        this.setEmployeeId(employeeId);
        this.setEmployeeAge(employeeAge);
        this.setEmployeeSex(employeeSex);
        this.setDepartment(department);
        this.setPosition(position);
    }


    public String introduction() {
        return "姓名：" + this.getEmployeeName() +
                "\n工号：" + this.getEmployeeId() +
                "\n年龄：" + this.getEmployeeAge() +
                "\n性别：" + this.getEmployeeSex() +
                "\n所属部门：" + this.getDepartment().getDeptName() +
                "\n职务：" + this.getPosition().getPositionName();
    }

}
