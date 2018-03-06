package com.learnJava.classhierarchy;

public class Car {

    private int year;
    private String owner;
    private int noOfWheels;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", owner='" + owner + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}
