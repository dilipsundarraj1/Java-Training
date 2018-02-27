package com.learnJava.sort;

public class Contact implements  Comparable{

    private String firstName, lastName, phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        int result;

        Contact temp = (Contact) o;

        if(firstName.equals((temp.lastName)))
            return firstName.compareTo(firstName);
        else
            return lastName.compareTo(temp.lastName);

    }
}
