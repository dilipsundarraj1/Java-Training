package com.learnJava.iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by z001qgd on 1/16/18.
 */
public class URLDissector {

    public static void main(String[] args) throws FileNotFoundException {

        String url;
        Scanner fileScanner,urlScanner;

        fileScanner = new Scanner(new File("/Dilip/College-Assignments/Esha/codebase/Java-Training/chapter-3/src/com/learnJava/iterator/urls.inp"));

        while(fileScanner.hasNext()){

            url = fileScanner.nextLine();

            System.out.println("URL" + url);

            urlScanner = new Scanner(url);
            urlScanner.useDelimiter("/");

            while(urlScanner.hasNext()){
                System.out.println(urlScanner.next());
            }
        }

    }
}
