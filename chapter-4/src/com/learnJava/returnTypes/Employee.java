package com.learnJava.returnTypes;

/**
 * Created by z001qgd on 12/23/17.
 */
public class Employee {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Dilip");




    }
}
