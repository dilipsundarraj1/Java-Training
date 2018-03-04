package com.learnJava.inheritance;

public class Dictionary2 extends  Book2{

    private int definitions;

    public Dictionary2(int pages,int definitions) {
        super(pages);
        this.definitions = definitions;
    }
}
