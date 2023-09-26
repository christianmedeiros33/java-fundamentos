package com.javaFundamentos.javacore.introduction.test;

import com.javaFundamentos.javacore.introduction.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        car.name = "miata";
        car.model = "mazda";
        car.year = 1994;

        car1.name = "nsx";
        car1.model = "honda";
        car1.year = 1993;

        car = car1;

        System.out.println(car.name);
        System.out.println(car.year);
        System.out.println(car.model);

        System.out.println();

        System.out.println(car1.name);
        System.out.println(car1.year);
        System.out.println(car1.model);

    }
}
