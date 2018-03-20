package com.learnJava.apstyle;

import java.util.Date;

public class Perishable extends InventoryItem {

    private Date expiryDate;

    public Perishable(Date entry, double basePrice, Date expiryDate, String item) {
        super(entry, basePrice,item);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getPrice() {

        if(expiryDate.compareTo(getEntry()) <0){
            return getBasePrice() * .1;
        }
        return getBasePrice();
    }


    public static void main(String[] args) {

        Date date1 = java.sql.Date.valueOf("2018-03-18");
        Date date2 = java.sql.Date.valueOf("2018-03-19");
        Date date3 = java.sql.Date.valueOf("2018-03-19");

        System.out.println(date1.compareTo(date2));
        System.out.println(date2.compareTo(date1));
        System.out.println(date2.compareTo(date3));
    }

}
