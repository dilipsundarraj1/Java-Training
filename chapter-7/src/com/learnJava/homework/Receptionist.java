package com.learnJava.homework;

public class Receptionist extends HospitalEmployee {

    public Receptionist(String name, String role, int age, String gender) {
        super(name, role, age, gender);
    }


    public void performYourRole(){
        System.out.println("Hi, Welcome to the Hospital.");
    }
}
