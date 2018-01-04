package com.learnJava;


import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.Scanner;

public class TaskMaster {

    public static void main(String[] args) {

        Task task1=new Task("Taking Shower", "MEDIUM",0);
        Task task2=new Task("Finish School HomeWork", "HIGH",1);


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the priority of Finishing School HomeWork ? :");

        String priority = scanner.nextLine();

        if(task2.getPriority().equalsIgnoreCase(priority)){
            System.out.println("Correct Answer");
        }else{
            System.out.println("In-Correct Answer");
        }
        System.out.println("What is the priority of Taking Shower ? :");

        priority = scanner.nextLine();


        if(task1.getPriority().equalsIgnoreCase(priority)){
            System.out.println("Correct Answer");
        }else{
            System.out.println("In-Correct Answer");
        }

        System.out.println("Comparing the Tasks");
        task2.compareTo(task1);


    }
}
