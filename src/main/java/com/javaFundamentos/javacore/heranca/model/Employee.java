package com.javaFundamentos.javacore.heranca.model;

public class Employee extends Person {
    private double salary;

    public Employee(String name) {
            super(name);
    }

    public void print() {
        // vem da Person
        super.print();
        // add junto ao metodo print
        System.out.println(this.salary);
    }
    public void paymentReport(){
        System.out.println("My" + this.name + "salario" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
