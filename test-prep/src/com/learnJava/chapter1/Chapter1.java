package com.learnJava.chapter1;

import java.util.Scanner;

public class Chapter1 {

    public static void question16(){

        int value =0;
        final int SENTINEL=-999;
        while(value !=SENTINEL){

            System.out.println("Entered Value : " + value);
            Scanner scanner = new Scanner(System.in);

            value = scanner.nextInt();

        }
    }

    static void question26(){

        int n =234,rem,revNum=0;

      /*  for(int i=0;i<=n;i++){
            rem=n%10;
            revNum=revNum*10+rem;
            n/=10;
        }*/

        while (n!=0){
            rem = n%10;
            revNum=revNum*10+rem;
            n/=10;
        }


        /*for(int i=n;i!=0;i/=10){

            rem = i%10;
            revNum=revNum*10+rem;
        }*/

        System.out.println("result is " + revNum);

    }
    public static void main(String[] args) {

       // question16();

        System.out.println(1/10);

        question26();
    }
}
