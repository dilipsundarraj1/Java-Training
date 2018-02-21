package com.learnJava.arrayobjects;

/**
 * Created by z001qgd on 1/11/18.
 */
public class CD implements Comparable {

    private String title, artist;
    private double cost;
    private  int tracks;

    public CD(String title, String artist, double cost, int tracks) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", cost=" + cost +
                ", tracks=" + tracks +
                '}';
    }

    @Override
    public int compareTo(Object cd) {

        int result;
        CD tempCD = (CD) cd;
        if(cd!=null){
            result =this.title.compareTo(tempCD.title);
        }else{
            return 0;
        }

        return result;
    }
}
