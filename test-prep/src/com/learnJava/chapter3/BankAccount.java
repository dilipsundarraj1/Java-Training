package com.learnJava.chapter3;

public class BankAccount {

    private double balance;


    public BankAccount(){
        balance=0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public double getBalance(){

        return balance;
    }

    public void transfer(BankAccount another, double amount){

        withdraw(amount);
        another.deposit(amount);
    }


}
