package com.omy.javadesignpatterns.creational.staticfactory._functional_interface;

public class CricketPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Cricket player playing ...");
    }
}