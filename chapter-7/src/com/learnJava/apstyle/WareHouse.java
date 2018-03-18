package com.learnJava.apstyle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WareHouse {

    private ArrayList<InventoryItem> items;

    public WareHouse(ArrayList<InventoryItem> items) {
        this.items = items;
    }

    public ArrayList<InventoryItem> getItems(double loPrice, double hiPrice){

        ArrayList<InventoryItem> inventoryRangeItems = new ArrayList<>();

        for(InventoryItem inventoryItem : items){

            if(inventoryItem.getBasePrice()>=loPrice && inventoryItem.getBasePrice()<=hiPrice){
                inventoryRangeItems.add(inventoryItem);
            }
        }

        return inventoryRangeItems;
    }
}
