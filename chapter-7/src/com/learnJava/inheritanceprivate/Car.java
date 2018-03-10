package com.learnJava.inheritanceprivate;

public class Car {

    private String owner;

    public Car(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
