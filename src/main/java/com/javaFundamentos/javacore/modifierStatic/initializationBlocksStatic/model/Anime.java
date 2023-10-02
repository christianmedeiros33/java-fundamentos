package com.javaFundamentos.javacore.modifierStatic.initializationBlocksStatic.model;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0- bloco de inicialização e executado quando a JVM carregar class
    // 1- alocação espaço em memória para o objeto
    // 2- cada atributo de classe criado e inicializado com valores default ou o quer for passado
    // 3- Bloco de inicialização e executado
    // 4- Construtor e executado

    static {    
        System.out.println("dentro do inicialização");
        episodes = new int[10];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("dentro do inicialização 2");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episodes : Anime.episodes
        ) {
            System.out.print(episodes + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }


}
