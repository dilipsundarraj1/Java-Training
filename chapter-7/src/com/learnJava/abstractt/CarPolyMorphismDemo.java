package com.learnJava.abstractt;

public class CarPolyMorphismDemo {

    public static void main(String[] args) {

        Vehicle vechicle = new Car();
        vechicle.drive();
        //vechicle.

        vechicle = new Boat();
        vechicle.drive();

        Car car= new Car();
        car.method1();

    }
}
