package com.learnJava.chapter3;

public class CheckingAccount extends BankAccount{

    private  static final double FEE=2.0;
    private static final double MIN_BALANCE=50.0;

    public  CheckingAccount(double accountBalance){
        super(accountBalance);
    }

    public void withdraw(double amount){

    }
}
