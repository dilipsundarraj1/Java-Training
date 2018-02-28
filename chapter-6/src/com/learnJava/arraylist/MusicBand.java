package com.learnJava.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MusicBand {
    public static void main(String[] args) {


        ArrayList<String> artists = new ArrayList(); //Creates an instance of the ArrayList

        artists.add("ABC");//0 //add method to add an element to the list.
        artists.add("XYZ");//1
        artists.add("GHI");//2
        /*artists.add(1);*/

        artists.add(0,null);

        artists.set(0,"ABC");

        /*for(String s : artists)
            System.out.println(s);*/

        ListIterator artistIterator = artists.listIterator();
        while (artistIterator.hasNext())
            System.out.println(artistIterator.next());




        System.out.println(artists);

        int location = artists.indexOf("ABC"); // returns the location of the artists.
        System.out.println("Location : " + location);

        System.out.println("Size of the artists : " + artists.size());
    }
}
