package com.javaFundamentos.javacore.methods.exerciseOO;

public class EmployeeObjeto {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "christian";
        employee.age = 22;
        employee.salarys = new double[]{1200, 900, 200};

        employee.printOut();
    }
}
