package com.learnJava.chapter3;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){

    }
}
