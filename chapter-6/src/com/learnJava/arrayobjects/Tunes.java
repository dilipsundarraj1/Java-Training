package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 1/11/18.
 */
public class Tunes {

    public  static void sortCDByTitle(Comparable[] objects){

        int objLength = objects.length;
        for (int index=1;index<objLength;index++){

            Comparable temp = objects[index];

            if(temp!=null){

            int position = index;

            while (position > 0 && objects[position-1].compareTo(temp) >0 ){

                objects[position] = objects[position-1];
                position = position-1;
            }
            objects[position] = temp;
        }
        }

    }


    public static void main(String[] args) {

        CDCollection music = new CDCollection();

        music.addCD("XYZ","artist1", 20.0,3 );
        music.addCD("ABC","artist1", 30.0,10 );

        System.out.println(music);

        music.addCD("Song2","artist1", 30.0,10 ); // ArrayindexOutofBounds
        music.addCD("Song5","artist1", 30.0,10 ); // ArrayindexOutofBounds

        System.out.println("Before SOrt");

        music.printCDCollection();

        Tunes.sortCDByTitle(music.getCollection());

        System.out.println("After SOrt SOrt");

        music.printCDCollection();



    }
}
