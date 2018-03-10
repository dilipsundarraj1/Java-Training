package com.learnJava.homework;

public class Doctor extends HospitalEmployee{
    public Doctor(String name, String role, int age, String gender) {
        super(name, role, age, gender);
    }

    public void performYourRole(){
        System.out.println("Check the patients");
    }
}
