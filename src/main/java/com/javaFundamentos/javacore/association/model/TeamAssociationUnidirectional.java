package com.javaFundamentos.javacore.association.model;

public class TeamAssociationUnidirectional {
    private String name;
    private Player[] players;


    public void printOut() {
        System.out.println(this.name);
        if (players == null) return;
        for (Player player : players) {
            System.out.println(player.getName());
        }

    }


    public TeamAssociationUnidirectional(String name) {
        this.name = name;
    }

    public TeamAssociationUnidirectional(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
