package com.learnJava.classhierarchy;

public class Toyota extends  Car {

    private String gearStyle;

    public String getGearStyle() {
        return gearStyle;
    }

    public void setGearStyle(String gearStyle) {
        this.gearStyle = gearStyle;
    }

    public void drive(){
        System.out.println("inside Camry drive method");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "gearStyle='" + gearStyle + '\'' +
                '}';
    }
}
