package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 2/8/18.
 */
public class CarCollection {

    Car[] cars = new Car[5];

    int count=0;

    public void addCar(Car car){

        if(count == cars.length){

            Car carTemp[] = new Car[cars.length * 2];

            for(int i=0;i<cars.length;i++){
                carTemp[i] = cars[i];
            }

            cars = carTemp;
        }

        cars[count] = car;
        count = count+1;

    }

    public void printArray(){

        for(Car c : cars){
            System.out.println(c);
        }
    }

}
