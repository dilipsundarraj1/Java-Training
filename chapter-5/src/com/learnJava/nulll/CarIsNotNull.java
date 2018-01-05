package com.learnJava.nulll;

/**
 * Created by z001qgd on 1/5/18.
 */
public class CarIsNotNull {

    private String model;
    private int year;

    public CarIsNotNull(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        CarIsNotNull car1 = new CarIsNotNull("Camry", 2017);

        if(car1!=null){
            System.out.println("Car is not null");
        }else if(car1==null){
            System.out.println("Car is null");
        }
    }


}
