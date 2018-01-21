package com.learnJava.arrayobjects;

import java.util.Arrays;

/**
 * Created by z001qgd on 1/11/18.
 */
public class CDCollection {

    private CD[] collection;
    private int count;
    private double totalCost;

    public CDCollection() {
        collection = new CD[2];
        count =0;
        totalCost =0.0;
    }

    public void addCD( String title, String artist, double cost, int tracks){

        if(count == collection.length){
            increaseSize();
        }
        collection[count] = new CD(title,artist,totalCost,tracks);
        totalCost+=cost;
        count++;

    }

    private void increaseSize() {

        CD[] temp = new CD[collection.length * 2];

        for(int cd =0; cd < collection.length; cd++){
            temp[cd] = collection[cd];
        }
        collection = temp;
    }

    @Override
    public String toString() {
        return "CDCollection{" +
                "collection=" + Arrays.toString(collection) +
                ", count=" + count +
                ", totalCost=" + totalCost +
                '}';
    }
}
