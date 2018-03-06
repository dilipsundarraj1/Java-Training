package com.learnJava.object;

public class Academic {

    public static void main(String[] args) {

        Student frank = new Student("Frank", 5);

        StudentAthelete adam = new StudentAthelete("Adam", 5,"soccer");

        StudentAthelete adam2 = new StudentAthelete("Adam", 5,"soccer");

        System.out.println(frank); // calls the overriden toString() Method.

        System.out.println(adam); // calls the overriden toString() Method.

        if(!frank.equals(adam)){ //calls the overriden equals Method.
            System.out.println("These are two different students");
        }

        if(adam2.equals(adam)){ // overriden the equals method from Object class
            System.out.println("These are same students");
        }
        System.out.println(frank.hashCode()); // Random number generated by Object class.
        System.out.println(adam.hashCode()); // Random number generated by Object class.


    }
}