package com.javaFundamentos.javacore.introduction.test;

import com.javaFundamentos.javacore.introduction.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "christian";
        student.age = 22;
        student.sex = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        System.out.println("---=======---");

        Student student2 = new Student();
        student2.name = "medeiros";
        student2.age = 21;
        student2.sex = 'M';
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.sex);
    }
}
