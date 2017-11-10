package schoolHomeWork;

import java.util.Scanner;

/**
 * Created by z001qgd on 11/9/17.
 */
public class BackWards {

    public static void main(String[] args) {

        System.out.println("Please enter a String :");

        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();

        System.out.println("Entered Name is : " + userInput);
        char[] try1 = userInput.toCharArray();

        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);

    }
}
