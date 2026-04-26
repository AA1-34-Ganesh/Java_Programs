package com.placement.training;

class Student extends StudentDetails1{
     int age;

    Student(String name, long regNo, String section, String department, int age) {
        super(name, regNo, section, department);
        this.age = age;
    }

}
