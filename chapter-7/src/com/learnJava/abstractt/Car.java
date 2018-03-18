package com.learnJava.abstractt;

public class Car extends Vehicle {

    @Override
    public int calculateMileage(int speed) {
        return speed /10;
    }

    public void drive(){
        System.out.println("Drive the Car");
    }

    public void method1(){
        System.out.println("inside method1 in car");
    }

    public static String getVehicleYear(){
        System.out.println("getVehicleYear in Vehicle ");
        return year;
    }

}
