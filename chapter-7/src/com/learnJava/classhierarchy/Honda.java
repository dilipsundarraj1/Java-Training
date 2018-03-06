package com.learnJava.classhierarchy;

public class Honda extends  Car {

    private String gearStyle;

    @Override
    public String toString() {
        return "Honda{" +
                "gearStyle='" + gearStyle + '\'' +
                '}';
    }

    public String getGearStyle() {
        return gearStyle;
    }

    public void setGearStyle(String gearStyle) {
        this.gearStyle = gearStyle;
    }

    public void drive(){
        System.out.println("inside Honda drive method");
    }
}
