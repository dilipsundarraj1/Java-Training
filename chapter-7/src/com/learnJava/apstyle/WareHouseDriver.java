package com.learnJava.apstyle;

import java.sql.Date;
import java.util.ArrayList;

public class WareHouseDriver {

    public static void main(String[] args) {

        Perishable perishable1 = new Perishable(Date.valueOf("2018-03-17"),20.0,Date.valueOf("2018-03-24"),"Chicken");
        Perishable perishable2 = new Perishable(Date.valueOf("2018-03-17"),4.99,Date.valueOf("2018-04-04"),"Eggs");
        Perishable perishable3 = new Perishable(Date.valueOf("2018-03-17"),8.99,Date.valueOf("2018-03-16"),"Fish");


        NonPerishable nonPerishable1 = new NonPerishable(Date.valueOf("2018-03-17"),7.99,"Protein Bar");
        NonPerishable nonPerishable2 = new NonPerishable(Date.valueOf("2018-03-17"),3.99,"Ramen Noodles");
        NonPerishable nonPerishable3 = new NonPerishable(Date.valueOf("2018-03-17"),12.99,"Almonds");


        ArrayList<InventoryItem> inventoryItems = new ArrayList<>();
        inventoryItems.add(perishable1);
        inventoryItems.add(perishable2);
        inventoryItems.add(perishable3);
        inventoryItems.add(nonPerishable1);
        inventoryItems.add(nonPerishable2);
        inventoryItems.add(nonPerishable3);

        WareHouse wareHouse = new WareHouse(inventoryItems);
        ArrayList<InventoryItem> subInventoryList = wareHouse.getItems(4.99,12.99);

        System.out.println("subInventoryList : " + subInventoryList);

        for(InventoryItem inventoryItem : inventoryItems){
            System.out.println("Item : " + inventoryItem.getItemName() +" , " + "Price : " + inventoryItem.getPrice());;
        }
        //System.out.println(Date.valueOf("2018-03-20"));
    }
}
