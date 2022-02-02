package com.omy.javadesignpatterns.creational.staticfactory._enum;

public class TennisPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Tennis player playing ...");
    }
}