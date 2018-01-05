package com.learnJava.nulll;

/**
 * Created by z001qgd on 1/2/18.
 */
public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        Car car1 = new Car("Camry", 2017);
        Car car2 = new Car("Camry", 2017);
        String name = "Scooby"; //name is a reference variable.
        int i =1; //i is not a reference variable.i is just a primitive.
        System.out.println(name.length());

        String name1=null;

       // System.out.println(name1.length());
        if(name1==null)
            System.out.println("name1 is null");
        else
            System.out.println(name1.length());

        String name2 = "Essha";

        Car car3 = new Car("djdd", 222);



    }
}
