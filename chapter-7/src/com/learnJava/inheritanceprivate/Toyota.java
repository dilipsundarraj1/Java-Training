package com.learnJava.inheritanceprivate;

public class Toyota extends Car {

    public Toyota(String owner) {
        super(owner);
    }

    public static void main(String[] args) {

        Toyota toyota = new Toyota("ABC");
        //toyota.owner// wont accessible , because ownwer memeber is private
        System.out.println(toyota.getOwner());
    }
}
