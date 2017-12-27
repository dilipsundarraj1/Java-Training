package com.learnJava.methodOverload;

/**
 * Created by z001qgd on 12/26/17.
 */
public class Car {

    private String owner;
    private  int year;
    private String model;

    public Car(){

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
