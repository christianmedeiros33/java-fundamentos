package com.javaFundamentos.javacore.heranca.test;

import com.javaFundamentos.javacore.heranca.model.Address;
import com.javaFundamentos.javacore.heranca.model.Employee;
import com.javaFundamentos.javacore.heranca.model.Person;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();
        Person person = new Person("christian");
        Employee employee = new Employee("chris");

        address.setStreet("Street 3");
        address.setCep("18273-999");

        person.setCpf("192.333.555-99");
        person.setAddress(address);
        person.print();

        System.out.println("=====");

        employee.setCpf("000.111.222-3");
        employee.setAddress(address);
        employee.setSalary(12000);
        employee.print();
    }
}
