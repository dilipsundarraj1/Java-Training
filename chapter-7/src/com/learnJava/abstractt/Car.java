package com.learnJava.abstractt;

public class Car extends Vehicle {

    @Override
    public int calculateMileage(int speed) {
        return speed /10;
    }

    public void drive(){
        System.out.println("Drive the Car");
    }
}
