package com.learnJava.thiis;

/**
 * Created by z001qgd on 1/4/18.
 */
public class Truck {

    private String driverName;
    private String truckOwnwer;

    public Truck(String driverName, String truckOwnwer) {
        this.driverName = driverName;
        this.truckOwnwer = truckOwnwer;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTruckOwnwer() {
        return truckOwnwer;
    }

    public void setTruckOwnwer(String truckOwnwer) {
        this.truckOwnwer = truckOwnwer;
    }

    public void printDriverName(){
        System.out.println(this.driverName);
        System.out.println(this.truckOwnwer);
    }

    public static void main(String[] args) {

        Truck truck2 = new Truck("Dilip", "XYZ");
      //  System.out.println(truck.getDriverName());
        truck2.printDriverName();

        Truck truck1 = new Truck("Scooby", "ABC");
      //  System.out.println(truck1.getDriverName());
        truck1.printDriverName();

    }
}
