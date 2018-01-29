package com.learnJava.arrays;

import java.util.Scanner;

/**
 * Created by z001qgd on 1/8/18.
 */
public class LetterCount {

    public static void main(String[] args) {

        final int NUMCHARS = 26;
        Scanner scanner = new Scanner(System.in);
        char current;
        int other=0;

        int[] upper = new int [NUMCHARS];
        int[] lower = new int [NUMCHARS];

        System.out.println("Enter a sentence : ");

        String line = scanner.nextLine();

        System.out.println(" Length of the entered String : " + line.length());

        for(int ch=0;ch < line.length(); ch++){ //Esha
            current = line.charAt(ch);
            if(current >= 'A' && current <='Z')
                upper[current-'A']++;
            else
                if(current >= 'a' && current<= 'z')
                    lower[current-'a']++;
                else
                    other++;
        }
        for(int letter=0; letter<upper.length; letter++){

            System.out.println( (char) (letter+'A') + ": " + upper[letter] +  "\t" + (char) (letter+'a') + ": "+  + lower[letter]);

        }

        System.out.println(" non Alphaber character : "  + other);
    }
}
