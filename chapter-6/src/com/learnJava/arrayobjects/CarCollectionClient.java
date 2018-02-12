package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 2/8/18.
 */
public class CarCollectionClient {

    public static void main(String[] args) {

        CarCollection carCollection = new CarCollection();

        Car car = new Car("owner1", "color1");
        Car car1 = new Car("owner1", "color1");
        Car car2 = new Car("owner1", "color1");
        Car car3 = new Car("owner1", "color1");
        Car car4 = new Car("owner1", "color1");

        carCollection.addCar(car);
        carCollection.addCar(car1);
        carCollection.addCar(car2);
        carCollection.addCar(car3);
        carCollection.addCar(car4);
        carCollection.addCar(car1);

        carCollection.printArray();
    }
}
