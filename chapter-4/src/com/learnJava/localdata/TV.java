package com.learnJava.localdata;

/**
 * Created by z001qgd on 12/25/17.
 */
public class TV {

    private String type;
    private int tvSize;

    public TV(String type, int tvSize) {
        this.type = type;
        this.tvSize = tvSize;
    }

    public void start(){

        int channel =0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTvSize() {
        return tvSize;
    }

    public void setTvSize(int tvSize) {
        this.tvSize = tvSize;
    }
}
