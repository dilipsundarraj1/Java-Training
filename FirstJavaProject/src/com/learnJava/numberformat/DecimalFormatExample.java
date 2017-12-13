package com.learnJava.numberformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by z001qgd on 12/6/17.
 */
public class DecimalFormatExample {

    public static void main(String[] args) {

        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.06));

        /*Locale[] locales = NumberFormat.getAvailableLocales();

        for(Locale lo : locales){
            System.out.println(lo.getCountry());
        }*/

    }
}
