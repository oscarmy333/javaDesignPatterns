package com.omy.javadesignpatterns.creational.singleton._synchronized_block;

public class Employee {
    private static Employee employee;

    private Employee() {
        // private constructor
    }

    public static Employee getEmployee() {
        if(employee == null){
            synchronized (Employee.class) {
                employee = new Employee();
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
