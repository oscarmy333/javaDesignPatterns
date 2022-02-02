package com.omy.javadesignpatterns.creational.staticfactory._functional_interface;

public class TennisPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Tennis player playing ...");
    }
}