package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 2/8/18.
 */
public class Car extends Object {

    private String owner;
    private String color;

    public Car(String owner1, String color1){
        this.color = color1;
        this.owner = owner1;
    }

    @Override
    public String toString() {
        return owner+"," + color;
    }
}
