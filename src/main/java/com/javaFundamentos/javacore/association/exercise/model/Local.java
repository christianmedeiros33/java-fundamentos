package com.javaFundamentos.javacore.association.exercise.model;

public class Local {
    public String local;

    public void imprimir() {
        System.out.println(this.local);
    }

    public Local(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
