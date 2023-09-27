package com.javaFundamentos.javacore.methods.exerciseOO;

public class Employee {
    public String name;
    public int age;
    public double[] salarys;

    public void printOut() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salarys == null) {
            return;
        }
        for (double salary : salarys) {
            System.out.print(salary + " - ");
        }
        average();
    }

    public void average() {
        if (salarys != null) {
            return;
        }
        double averageSalary = 0;
        for (double salary : salarys) {
            averageSalary += salary;
        }
        averageSalary /= salarys.length;
        System.out.println("\nAverage Salarys: " + averageSalary);
    }
}
