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

    public static void main(String[] args) {

        Truck truck = new Truck("Dilip", "XYZ");

        truck.getDriverName();
        Truck truck1 = new Truck("Scooby", "XYZ");
        truck1.getDriverName();
    }
}
