package com.javaFundamentos.javacore.initializationBlocks.test;

import com.javaFundamentos.javacore.initializationBlocks.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
