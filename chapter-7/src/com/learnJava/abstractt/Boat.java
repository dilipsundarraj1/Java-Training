package com.learnJava.abstractt;

public class Boat extends Vehicle{

    @Override
    public int calculateMileage(int speed) {
        return speed/20;
    }

    public void drive(){
        System.out.println("Drive the Boat");
    }
}
