package com.javaFundamentos.javacore.association.model;

public class School {
    private String name;
    private Teacher[] teachers;

    public School(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void printOut() {
        System.out.println(this.getName());
        if (teachers == null) return;
        for (Teacher teacher : teachers) {
            System.out.print(teacher.getName() + ", ");
        }

    }

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
