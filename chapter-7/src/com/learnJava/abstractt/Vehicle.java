package com.learnJava.abstractt;

public abstract class Vehicle {

    public String owner;

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



    public abstract int calculateMileage(int speed);
}
