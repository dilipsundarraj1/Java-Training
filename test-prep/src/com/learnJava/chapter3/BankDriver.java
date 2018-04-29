package com.learnJava.chapter3;

public class BankDriver {

    public static void main(String[] args) {

        BankAccount b = new BankAccount(1400);
        SavingsAccount timeSavings = new SavingsAccount(1500,0.04);
        CheckingAccount daysnasChecking = new CheckingAccount(2000);
       /* BankAccount s = new SavingsAccount(1000,0.04);
        BankAccount c = new CheckingAccount(500);
        b.deposit(200);
        s.withdraw(500);
        c.withdraw(500);
        s.deposit(10000);*/
        //s.addInterest();
        b.transfer(timeSavings,50);
        timeSavings.transfer(daysnasChecking,30);
        daysnasChecking.transfer(b,55);
    }
}
