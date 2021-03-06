package com.omy.javadesignpatterns.creational.staticfactory._string;

public class PlayerFactory {
    public static Player createPlayer(String playerType) {

        if(playerType == null){
            return null;
        }

        if(playerType.equalsIgnoreCase("TENNIS")){
            return new TennisPlayer();
        } else if(playerType.equalsIgnoreCase("FOOTBALL")){
            return new FootballPlayer();
        } else if(playerType.equalsIgnoreCase("CRICKET")){
            return new CricketPlayer();
        }
        return null;
    }
}
