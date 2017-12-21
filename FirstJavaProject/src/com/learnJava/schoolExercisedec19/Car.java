package com.learnJava.schoolExercisedec19;

/**
 * Created by z001qgd on 12/19/17.
 */
public class Car {

    int yearOftheCar; //global varible
    static String model ;


    public void drive(){

        int driverAge = 12;//local variable
        yearOftheCar=10;
    }


    public void brake(){

        yearOftheCar=10;
    }


    public static void main(String[] args) {

        Car car1=  new Car(); //object or instances

        car1.yearOftheCar=2018;
        car1.model="Toyota";
        System.out.println(car1.yearOftheCar);



        Car car2=  new Car();
        car2.yearOftheCar=2019;
        car2.model="Honda";
        System.out.println(car2.yearOftheCar);

        Car car3=  new Car();
        car3.yearOftheCar=2020;
        System.out.println(car3.yearOftheCar);
        car3.model="Hyndai";

        System.out.println(car1.model);
        System.out.println(car2.model);

    }
}
