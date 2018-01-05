package com.learnJava.aliases;

/**
 * Created by z001qgd on 1/4/18.
 */
public class Num {

    private int number;

    public Num(int number) {
        this.number = number;
    }

    public static void main(String[] args) {

        Num number = new Num(1);
        System.out.println(number);

        int a1=1;
        int a2=1;

        System.out.println(a1==a2);

      Integer i1 = new Integer(1);  // i1 refers to a reference variable address, not the value 1.
      Integer i2 = new Integer(1);  // i2 refers to a reference variable address, not the value 1.


        System.out.println(i1==i2); //false, == refer to the variable address.They both refer to different reference variable address.
        System.out.println(i1.equals(i2));//true, equals method compares the vaule not the addess.

        Integer i3 = i2; // now I3 and I2 refers to the same address.

        System.out.println(i3==i2); // true,  because both are referring to the same address.


        String name1 ="Dilip";
        String name2 ="Dilip";
        System.out.println(name1==name2);


    }
}
