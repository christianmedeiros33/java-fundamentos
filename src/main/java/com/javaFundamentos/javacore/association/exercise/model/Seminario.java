package com.javaFundamentos.javacore.association.exercise.model;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public void imprimir() {
        System.out.println(this.titulo);
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
