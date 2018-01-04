package com.learnJava.nulll;

/**
 * Created by z001qgd on 1/2/18.
 */
public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        Car car1 = new Car("Camry", 2017);
        Car car2 = new Car("Camry", 2017);
        String name = "Scooby"; //name is a reference variable.
        int i =1; //i is not a reference variable.i is just a primitive.

    }
}
