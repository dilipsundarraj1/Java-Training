package com.learnJava.intetfacee;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
