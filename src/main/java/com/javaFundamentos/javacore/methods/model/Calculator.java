package com.javaFundamentos.javacore.methods.model;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void multiplication(int numberOne, int numberTwo) {
        int numbers = numberOne * numberTwo;
        System.out.println(numbers);
    }

    public double divisionOfTwoNumbers(double valueOne, double valueTwo) {
        if (valueOne == 0 || valueTwo == 0) {
            return 0;
        }
        return valueOne / valueTwo;
    }

    public void divisionOfTwoNumbers2(double valueOne, double valueTwo) {
        if (valueOne == 0 || valueTwo == 0) {
            System.out.println("cannot divide by zero");
            return;
        }
        System.out.println(valueOne / valueTwo);
    }

    public void changesTwoNumbers(int valueOne, int valueTwo) {
        valueOne = 22;
        valueTwo = 11;
        System.out.println(valueOne);
        System.out.println(valueTwo);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers
        ) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

}
