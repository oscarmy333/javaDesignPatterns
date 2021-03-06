package com.omy.javadesignpatterns.creational.singleton._eager_initialization;

public class Demo {
    public static void main(String[] args) {
        // Compilation error: private constructor
        // Employee employee = new Employee();

        Employee employeeOne = Employee.getEmployee();
        employeeOne.printEmployee();

        Employee employeeTwo = Employee.getEmployee();
        employeeTwo.printEmployee();
    }
}
