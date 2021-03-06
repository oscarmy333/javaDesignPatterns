package com.omy.javadesignpatterns.creational.staticfactory._enum;

public class Demo {
    public static void main(String[] args) {
        Player tennisPlayer = PlayerFactory.createPlayer(PlayerType.TENNIS);
        tennisPlayer.play();

        Player footballPlayer = PlayerFactory.createPlayer(PlayerType.FOOTBALL);
        footballPlayer.play();

        Player cricketPlayer = PlayerFactory.createPlayer(PlayerType.CRICKET);
        cricketPlayer.play();
    }
}
