package com.javaFundamentos.javacore.introduction.test;

import com.javaFundamentos.javacore.introduction.model.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "christian";
        teacher.age = 22;
        teacher.sex = 'M';

        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.sex);
    }

}
