package com.javaFundamentos.javacore.modifierStatic.model;

public class Car {
    private String name;
    private double maximumSpeed;
    private static double limitSpeed = 250;

    public void printOut() {
        System.out.println("========");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum speed: " + this.maximumSpeed);
        System.out.println("Limit speed: " + Car.limitSpeed);
    }

    public static double getLimitSpeed() {
        return limitSpeed;
    }

    public Car(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

}
