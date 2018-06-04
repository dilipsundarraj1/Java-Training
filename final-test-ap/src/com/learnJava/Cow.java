package com.learnJava;

public class Cow extends Animal {

    public String speak(){
        return "Moo";
    }

    public static void main(String[] args) {

        Animal[] a = { new Cat(), new Cow(), new Dog(), new Pig(), new Bird() };

        for(Animal a1 : a){
            System.out.println(a1.speak());
        }

    }

}
