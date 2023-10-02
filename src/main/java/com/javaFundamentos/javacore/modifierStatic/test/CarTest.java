package com.javaFundamentos.javacore.modifierStatic.test;

import com.javaFundamentos.javacore.modifierStatic.model.Car;

public class CarTest {
    public static void main(String[] args) {


        Car carOne = new Car("BMW", 280);
        Car carTwo = new Car("Mercedes", 275);
        Car carThree = new Car("Audi", 290);

        // fica claro que todas as velocidades serao alteradas por que estou modificando a class Car

        carOne.printOut();
        carTwo.printOut();
        carThree.printOut();
    }


}
