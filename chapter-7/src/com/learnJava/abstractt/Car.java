package com.learnJava.abstractt;

public class Car extends Vehicle {

    @Override
    public int calculateMileage(int speed) {
        return speed /10;
    }
}
