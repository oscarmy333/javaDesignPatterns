package com.omy.javadesignpatterns.creational.singleton._reflection;

public class Employee {
    private static Employee employee;

    private Employee() {
        // private constructor
    }

    public static Employee getEmployee() {
        if(employee == null){ // first check
            synchronized (Employee.class) {
                if(employee == null){ // second check
                    employee = new Employee();
                }
            }
        }
        return employee;
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " +
                this.hashCode());
    }
}
