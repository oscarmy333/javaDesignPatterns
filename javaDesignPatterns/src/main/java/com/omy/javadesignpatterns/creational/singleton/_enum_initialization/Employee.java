package com.omy.javadesignpatterns.creational.singleton._enum_initialization;

public enum Employee {
    INSTANCE;

    private Employee() {
        // private constructor
    }

    public Employee getEmployee() {
        return INSTANCE;
    }

    public void printEmployee() {
        System.out.println("Welcome to ABC Company !!! - " +
                this.getClass().getSimpleName() + " - " +
                this.hashCode());
    }
}
