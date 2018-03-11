package com.learnJava.abstractt;

public class CarPolyMorphismDemo {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.drive();

        Vehicle boat = new Boat();
        boat.drive();
    }
}
