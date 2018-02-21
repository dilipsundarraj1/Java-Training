package com.learnJava.arrayobjects;

public class CompareToExample {

    public static void main(String[] args) {

        String name = "ABC";
        String name1 = "XYZ";
        String name2 = "ABC";

        System.out.println(name.compareTo(name1));
        System.out.println(name1.compareTo(name));
        System.out.println(name.compareTo(name2));
    }
}
