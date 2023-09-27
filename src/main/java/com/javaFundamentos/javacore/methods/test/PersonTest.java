package com.javaFundamentos.javacore.methods.test;

import com.javaFundamentos.javacore.methods.model.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("christian");
        person.setAge(22);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }


}
