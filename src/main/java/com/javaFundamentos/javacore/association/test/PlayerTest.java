package com.javaFundamentos.javacore.association.test;

import com.javaFundamentos.javacore.association.model.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("pele");
        Player player2 = new Player("rocha");
        Player player3 = new Player("zico");

        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.printOut();
        }
    }
}
