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


}
