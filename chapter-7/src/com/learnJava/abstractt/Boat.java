package com.learnJava.abstractt;

public class Boat extends Vehicle{

    @Override
    public int calculateMileage(int speed) {
        return speed/20;
    }

    public void drive(){
        System.out.println("Drive the Boat");
    }

    public void method1(){
        System.out.println("inside method1 in car");
    }
}
