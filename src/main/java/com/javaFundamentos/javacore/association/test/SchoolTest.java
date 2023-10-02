package com.javaFundamentos.javacore.association.test;

import com.javaFundamentos.javacore.association.model.School;
import com.javaFundamentos.javacore.association.model.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("christian");
        Teacher teacher2 = new Teacher("pedro");
        Teacher teacher3 = new Teacher("marcos");
        Teacher[] teachers = {teacher, teacher2, teacher3};

        School school = new School("arambare", teachers);
        school.printOut();
    }
}
