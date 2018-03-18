package com.learnJava.abstractt;

public abstract class Vehicle {

    public String owner;

    public static String year="1990";

    public static final int b=0;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed;

    public void drive(){
        System.out.println("Drive the Vehicle");
    }

    public static String getVehicleYear(){
        System.out.println("getVehicleYear in Vehicle ");
        return year;
    }



    public abstract int calculateMileage(int speed);
}
