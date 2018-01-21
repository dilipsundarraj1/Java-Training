package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 1/11/18.
 */
public class Tunes {

    public static void main(String[] args) {

        CDCollection music = new CDCollection();

        music.addCD("Song1","artist1", 20.0,3 );
        music.addCD("Song2","artist1", 30.0,10 );

        System.out.println(music);

        music.addCD("Song2","artist1", 30.0,10 ); // ArrayindexOutofBounds

    }
}
