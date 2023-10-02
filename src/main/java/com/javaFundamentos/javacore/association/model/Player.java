package com.javaFundamentos.javacore.association.model;

public class Player {
    private String name;
    private TeamAssociationUnidirectional team;

    public void printOut() {
        System.out.println(this.name);
        if (team != null) {
            System.out.println(team.getName());
        }
    }

    public TeamAssociationUnidirectional getTeam() {
        return team;
    }

    public void setTeam(TeamAssociationUnidirectional team) {
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
