package com.learnJava.apstyle;

import java.util.Date;

public class NonPerishable extends InventoryItem {

    public NonPerishable(Date entry, double basePrice,String itemName) {
        super(entry, basePrice,itemName);
    }

    @Override
    public double getPrice() {
        return getBasePrice();
    }


}
