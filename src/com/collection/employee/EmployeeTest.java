package com.collection.employee;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1001, "马云", 30000);
        Employee employee2 = new Employee(1002, "马化腾", 35000);
        Employee employee3 = new Employee(1003, "李彦宏", 32000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("员工的姓名和工资分别为：");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}
