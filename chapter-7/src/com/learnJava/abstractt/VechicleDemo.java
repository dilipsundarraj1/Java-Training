package com.learnJava.abstractt;

public class VechicleDemo {

    public static void main(String[] args) {

        Car car = new Car();
        car.setOwner("ABC");
        car.setSpeed(40); // calls the speed of the Car class
        car.drive(); // calls the drive method of the abstract class

        System.out.println("car mileage per gallon : "+car.calculateMileage(car.getSpeed()));

        Boat boat = new Boat();
        boat.setOwner("XYZ");
        boat.setSpeed(60);  // calls the speed of the boat class
        boat.drive(); // calls the drive method of the abstract class

        System.out.println("boat mileage per gallon : "+boat.calculateMileage(boat.getSpeed()));
    }
}
