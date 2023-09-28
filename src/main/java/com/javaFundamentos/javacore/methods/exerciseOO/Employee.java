package com.javaFundamentos.javacore.methods.exerciseOO;

public class Employee {
    private String name;
    private int age;
    private double[] salarys;
    private double averageSalary;

    public void printOut() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (this.salarys == null) {
            return;
        }
        for (double salary : this.salarys) {
            System.out.print(salary + " - ");
        }
        average();
    }

    public void average() {
        if (this.salarys == null) {
            return;
        }

        for (double salary : this.salarys) {
            averageSalary += salary;
        }
        averageSalary /= this.salarys.length;
        System.out.println("\nAverage Salarys: " + averageSalary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

}
