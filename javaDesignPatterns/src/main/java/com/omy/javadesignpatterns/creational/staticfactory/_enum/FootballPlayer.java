package com.omy.javadesignpatterns.creational.staticfactory._enum;

public class FootballPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Football player playing ...");
    }
}