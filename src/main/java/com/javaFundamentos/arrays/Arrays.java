package com.javaFundamentos.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 22;
        System.out.println(ages[0]);

        String[] names = new String[3];
        names[0] = "Christian";
        names[1] = "medeiros";
        names[2] = "janke";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] numbers = new int[3];
        int[] numeros2 = {1, 3, 4, 6, 7,};
//        int[] numeros2 = new int[]{1, 3, 4,};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
