package com.learnJava.apstyle;

import java.util.Date;
import java.util.Random;

public abstract class InventoryItem {

    private int id;
    private Date entry;
    private double basePrice;

    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



    public InventoryItem(Date entry, double basePrice, String itemName) {
        this.id = makeId();
        this.entry = entry;
        this.basePrice = basePrice;
        this.itemName = itemName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEntry() {
        return entry;
    }

    public void setEntry(Date entry) {
        this.entry = entry;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    abstract public double getPrice();

    public static int makeId(){

        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int id = rand.nextInt(1000);


        return id;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", entry=" + entry +
                ", basePrice=" + basePrice +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
