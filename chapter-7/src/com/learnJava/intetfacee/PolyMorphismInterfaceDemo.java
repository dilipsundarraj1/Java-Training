package com.learnJava.intetfacee;

public class PolyMorphismInterfaceDemo {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();
        animal.walk();

        animal = new Dog();
        animal.walk();
        animal.eat();
    }
}
