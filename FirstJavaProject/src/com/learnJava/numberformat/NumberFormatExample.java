package com.learnJava.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by z001qgd on 12/6/17.
 */
public class NumberFormatExample {

    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        System.out.println(numberFormat.format(100));

        Locale indiaLocale = new Locale("in", "IN");

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(indiaLocale);

        System.out.println(numberFormat1.format(100));

        Locale ukLocale = new Locale("en", "GB");

        numberFormat1 = NumberFormat.getCurrencyInstance(ukLocale);

        System.out.println(numberFormat1.format(100));

        Locale japanLocale = new Locale("en", "JP");

    }
}
