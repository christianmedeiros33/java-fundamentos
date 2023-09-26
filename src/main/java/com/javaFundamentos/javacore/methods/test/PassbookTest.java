package com.javaFundamentos.javacore.methods.test;

import com.javaFundamentos.javacore.methods.model.Passbook;
import com.javaFundamentos.javacore.methods.model.PrintOut;

public class PassbookTest {
    public static void main(String[] args) {
        Passbook passbook = new Passbook();
        PrintOut print = new PrintOut();
        passbook.name = "happy";
        print.printOut(passbook);
        System.out.println("===remarcando===");
        print.printOut(passbook);
    }
}
