package com.learnJava;

/**
 * Created by z001qgd on 10/18/17.
 */
public class Car {

    private String color;
    private String brand;
    private String type;

    public void drive(Car abc, String name){

        System.out.println("Driving the ".concat(abc.brand).concat("car")); //Driving the Toyota Car
                //Who is drving the car
        System.out.println("Owner of this car is ".concat(name));
    }




    public void stop(){

    }

    public int getCarCapacity(){

        return 4;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Car toyota = new Car();
        toyota.brand ="Toyota";
        toyota.color="Black";
        toyota.type="Sedan";
        System.out.println(toyota);
        toyota.drive(toyota, "Dilip");

        //The car capacity is 4

        int toyotoCarCapcity = toyota.getCarCapacity();
        System.out.println(toyotoCarCapcity);

        Car mercedez= new Car();
        mercedez.brand="Mercedez";
        mercedez.color="Browm";
        mercedez.type="Sedan";
        System.out.println(mercedez);
        mercedez.drive(mercedez, "Scooby");



    }
}
