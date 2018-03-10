package com.learnJava.homework;

public class HospitalEmployee {

    private String name;
    private String role;
    private int age;
    private String gender;

    public HospitalEmployee(String name, String role, int age, String gender) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void performYourRole(){
        System.out.println("Default Work");
    }


}
