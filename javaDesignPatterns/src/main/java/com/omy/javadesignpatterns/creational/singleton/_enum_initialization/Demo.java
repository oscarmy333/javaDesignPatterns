package com.omy.javadesignpatterns.creational.singleton._enum_initialization;

public class Demo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new Thread(() -> {
                Employee employee = Employee.INSTANCE.getEmployee();
                employee.printEmployee();
            }).start();
        }
    }
}
