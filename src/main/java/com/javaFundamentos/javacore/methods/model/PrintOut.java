package com.javaFundamentos.javacore.methods.model;

public class PrintOut {
    public void printOut(Passbook passbook){
        System.out.println(passbook.name);
        passbook.name = "remarcada";
    }
}
