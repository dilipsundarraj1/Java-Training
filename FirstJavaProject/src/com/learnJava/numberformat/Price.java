package com.learnJava.numberformat;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by z001qgd on 12/4/17.
 */
public class Price {
    public static void main(String[] args) {
        final double TAX_RATE=0.06;

        int quantity;
        double total, subtotal, tax, unitPrice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Product you want to buy : ");

        String item = scan.next();
        System.out.println("Item is : " + item);

        System.out.println("Enter the quantity : ");
        quantity = scan.nextInt();

        System.out.println("Enter the unit price : ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;

        tax = subtotal * TAX_RATE;

        total = subtotal+ tax;

        System.out.println(" Total Balance  : " + total );

        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println("Subtotal : " + money.format(total));

        System.out.println("Tax : " + money.format(tax) +" at " + percent.format(TAX_RATE));

        System.out.println("Total Money is : " + money.format(total));
    }
}
