package com.javaFundamentos.javacore.association.test;

import com.javaFundamentos.javacore.association.model.Player;
import com.javaFundamentos.javacore.association.model.TeamAssociationUnidirectional;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("cafu");
        Player player2 = new Player("pele");
        TeamAssociationUnidirectional team = new TeamAssociationUnidirectional("brasil");

        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("players:");
        player.printOut();

        System.out.println();

        System.out.println("team: ");
        team.printOut();


    }
}
