package com.javaFundamentos.javacore.constructors.test;


import com.javaFundamentos.javacore.constructors.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece", "manga", 12, "action", "Marvel");
        anime.printOut();
        System.out.println();
    }
}
