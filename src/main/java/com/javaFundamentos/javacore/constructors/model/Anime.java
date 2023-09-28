package com.javaFundamentos.javacore.constructors.model;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    public Anime(String name, String type, int episodes, String gender) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String name, String type, int episodes, String gender, String studio) {
        this(name, type, episodes, gender);
        this.studio = studio;
    }

    public Anime() {
    }

    public void printOut() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
        System.out.println(this.studio);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }


}
