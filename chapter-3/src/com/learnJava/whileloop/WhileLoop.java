package com.learnJava.whileloop;

import java.util.Scanner;

/**
 * Created by z001qgd on 12/27/17.
 */
public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag=true;

        while(flag){
            System.out.println("Please enter a number : ");
            int i = scanner.nextInt();
            if(i<0){
                flag=true;
            }else{
                flag=false;
            }

        }
        System.out.println("Exiting the Program");

    }
}
