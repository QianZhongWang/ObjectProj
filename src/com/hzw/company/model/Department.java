package com.hzw.company.model;

public class Department {
    // 部门编号
    private String deptId;
    // 部门名称
    private String deptName;
    // 部门员工数组
    private Employee[] employees;
    // 部门员工人数
    private int employeeNum;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee[] getEmployees() {
        if (this.employees == null) {
            this.employees = new Employee[10];
        }
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }


    public Department() {

    }

    public Department(String deptId, String deptName) {
        this.setDeptId(deptId);
        this.setDeptName(deptName);
    }

    public Department(String deptId, String deptName, Employee[] employees, int employeeNum) {
        this.setDeptId(deptId);
        this.setDeptName(deptName);
        this.setEmployees(employees);
        this.setEmployeeNum(employeeNum);
    }


    public void addEmployee(Employee employee) {
        for (int i = 0; i < this.getEmployees().length; i++) {
            if (this.getEmployees()[i] == null) {
                employee.setDepartment(this);
                this.getEmployees()[i] = employee;
                this.setEmployeeNum(this.getEmployeeNum() + 1);
                return;
            }
        }
    }
}
