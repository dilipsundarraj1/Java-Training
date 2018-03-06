package com.learnJava.classhierarchy;

public class ClassHierarchyDemo {

    public static void main(String[] args) {

        Camry camry = new Camry();
        camry.setYear(1990);
        camry.drive();

        Honda honda = new Honda();
        honda.setYear(2000);
        honda.drive();
    }
}
