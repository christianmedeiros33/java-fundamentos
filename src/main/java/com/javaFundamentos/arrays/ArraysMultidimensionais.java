package com.javaFundamentos.arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dates = new int[3][3];
        dates[0][0] = 00;
        dates[0][1] = 01;
        dates[0][2] = 02;

        dates[1][0] = 10;
        dates[1][1] = 11;
        dates[1][2] = 12;

        dates[2][0] = 20;
        dates[2][1] = 21;
        dates[2][2] = 22;

        for (int i = 0; i < dates.length; i++) {
            for (int j = 0; j < dates[i].length; j++) {
                System.out.println("Valor: " + dates[i][j] + " indice: " + i + " - " + j);
            }
        }

        System.out.println("------");

        for (int[] arrBase : dates) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        System.out.println("------");

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int[][] arrayDirect = {
                {0, 0},
                {1, 2, 3},
                {1, 2, 3, 4, 5, 6}
        };

        for (int[] arrayBase : arrayDirect) {
            System.out.println("\n----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

    }
}
