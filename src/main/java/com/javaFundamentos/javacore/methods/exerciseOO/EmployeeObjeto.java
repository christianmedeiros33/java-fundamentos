package com.javaFundamentos.javacore.methods.exerciseOO;

public class EmployeeObjeto {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("christian");
        employee.setAge(22);
        employee.setSalarys(new double[]{1200, 900, 200});
        employee.printOut();
        System.out.println("media: " + employee.getAverageSalary());
    }
}
