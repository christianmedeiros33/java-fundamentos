package com.javaFundamentos.javacore.methods.test;

import com.javaFundamentos.javacore.methods.model.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.multiplication(10, 20);
        double result = calculator.divisionOfTwoNumbers(10, 10);
        System.out.println(result);
        System.out.println();
        calculator.divisionOfTwoNumbers2(10, 0);

        int valueOne = 1;
        int valueTwo = 2;
        calculator.changesTwoNumbers(valueOne, valueTwo);

        System.out.println("\nsum arrays\n");

        int[] numeros = {1, 2, 3, 4, 5};
        calculator.sumArray(numeros);

        System.out.println("\n VarArgs\n");

        calculator.sumVarArgs(1, 2, 34, 5, 6, 7, 7, 8, 8);

    }

}
