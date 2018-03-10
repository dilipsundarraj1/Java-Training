package com.learnJava.homework;


public class HospitalDriver {

    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist("Eve", "receptionist",25,"female");
        receptionist.performYourRole();

        Doctor doc = new Doctor("DEF","Doctor", 45, "female");
        doc.performYourRole();


    }
}
