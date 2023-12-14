package com.hzw.company.test;

import com.hzw.company.model.Department;
import com.hzw.company.model.Employee;
import com.hzw.company.model.Position;

public class CompanyTest {
    public static void main(String[] args) {
        // 初始化部门，人事部和市场部
        Department hrDept = new Department("D001", "人事部");
        Department marketDept = new Department("D002", "市场部");

        // 初始化职务，经理、助理、职员
        Position manager = new Position("P001", "经理");
        Position assistant = new Position("P002", "助理");
        Position staff = new Position("P003", "职员");

        // 初始化员工
        Employee staff1 = new Employee("张铭","S001",29,"男",hrDept,manager);
        Employee staff2 = new Employee("李艾爱","S002",21,"女",hrDept,assistant);
        Employee staff3 = new Employee("孙超","S003",29,"男",hrDept,assistant);
        Employee staff4 = new Employee("张美美","S004",26,"女",marketDept,staff);
        Employee staff5 = new Employee("蓝迪","S005",37,"男",marketDept,manager);
        Employee staff6 = new Employee("米莉","S006",24,"女",marketDept,staff);

        System.out.println(staff1.introduction());
        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println(staff2.introduction());
        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println(staff3.introduction());
        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println(staff4.introduction());
        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println(staff5.introduction());
        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println(staff6.introduction());
        System.out.println("++++++++++++++++++++++++++++++++++");

        hrDept.addEmployee(staff1);
        hrDept.addEmployee(staff2);
        hrDept.addEmployee(staff3);
        marketDept.addEmployee(staff4);
        marketDept.addEmployee(staff5);
        marketDept.addEmployee(staff6);

        System.out.println(hrDept.getEmployeeNum());
        System.out.println(marketDept.getEmployeeNum());




    }
}
