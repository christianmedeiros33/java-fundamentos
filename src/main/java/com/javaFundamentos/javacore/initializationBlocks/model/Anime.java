package com.javaFundamentos.javacore.initializationBlocks.model;

public class Anime {
    private String name;
    private int[] episodes;


    // 1- alocação espaço em memória para o objeto
    // 2- cada atributo de classe criado e inicializado com valores default ou o quer for passado
    // 3- Bloco de inicialização e executado
    // 4- Construtor e executado

    {
        System.out.println("inicialização");
        episodes = new int[10];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
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

    public Anime() {

        for (int episodes : this.episodes
        ) {
            System.out.print(episodes + " ");
        }
        System.out.println();
    }
}
