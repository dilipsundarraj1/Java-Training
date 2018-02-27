package com.learnJava.sort;

public class SortPhoneList {

    public static void insertionSort(Comparable[] contacts){

        for(int index=1; index<contacts.length; index++){
            Comparable key = contacts[index];
            int position = index;

            while(position>0 && contacts[position-1].compareTo(key) > 0 ){
                contacts[position] = contacts[position-1];
                position--;
            }

            contacts[position] = key;

        }
    }

    public static void main(String[] args) {

        Contact[] friends = new Contact[4];
        Contact contact1 = new Contact("Ben","DEF", "12345");
        Contact contact2 = new Contact("Adam","ABC", "12345");
        Contact contact4 = new Contact("Mathew","ABC", "12345");
        Contact contact3 = new Contact("Dan","XYZ", "12345");

        friends[0] = contact1;
        friends[1] = contact2;
        friends[2] = contact3;
        friends[3] = contact4;


        System.out.println("**** Before Sort ****");
        for(Contact contact :  friends){
            System.out.println(contact);
        }

        insertionSort(friends);
        System.out.println("**** After Sort ****");

        for(Contact contact :  friends){
            System.out.println(contact);
        }


     }
}
