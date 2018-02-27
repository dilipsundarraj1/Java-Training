package com.learnJava.arraylist;

import java.util.ArrayList;

public class MusicBand {
    public static void main(String[] args) {

        ArrayList artists = new ArrayList(); //Creates an instance of the ArrayList

        artists.add("ABC"); //add method to add an element to the list.
        artists.add("XYZ");
        artists.add("GHI");

        System.out.println(artists);

        int location = artists.indexOf("ABC"); // returns the location of the artists.
        System.out.println("Location : " + location);

        System.out.println("Size of the artists : " + artists.size());
    }
}
