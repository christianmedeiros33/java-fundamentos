package com.javaFundamentos.javacore.methods.test;

import com.javaFundamentos.javacore.methods.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.name = "christian";
        studentOne.age = 22;
        studentOne.sex = 'M';

        studentTwo.name = "medeiros";
        studentTwo.age = 23;
        studentTwo.sex = 'M';

        studentOne.printOut();
        studentTwo.printOut();

    }

}
