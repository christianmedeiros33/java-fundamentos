package com.javaFundamentos.javacore.methodsOverloads.test;

import com.javaFundamentos.javacore.methodsOverloads.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("one piece", "manga", 12, "action");
        anime.printOut();
    }
}
