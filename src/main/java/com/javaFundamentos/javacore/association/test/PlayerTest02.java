package com.javaFundamentos.javacore.association.test;

import com.javaFundamentos.javacore.association.model.Player;
import com.javaFundamentos.javacore.association.model.TeamAssociationUnidirectional;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("pele");
        TeamAssociationUnidirectional team = new TeamAssociationUnidirectional("brasil");
        player.setTeam(team);
        player.printOut();
    }
}
