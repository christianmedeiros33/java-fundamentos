package com.javaFundamentos.logica;

public class While_Do_While_For {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("----");

        count = 0;
        do {
            System.out.println("Dentro do dowhile " + ++count);
        } while (count < 10);

        System.out.println("----");

        for (int i = 0; i < 10; i++) {
            System.out.println("For para " + i);
        }

        System.out.println("----");

        // exercise number is pair
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0){
                System.out.println("number is pair: " + i);
            }
        }
    }
}
