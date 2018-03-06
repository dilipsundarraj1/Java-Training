package com.learnJava.object;

public class Student {

    private String name;
    private int numOfCourses;

    public Student(String name, int numOfCourses) {
        this.name = name;
        this.numOfCourses = numOfCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numOfCourses=" + numOfCourses +
                '}';
    }
}
