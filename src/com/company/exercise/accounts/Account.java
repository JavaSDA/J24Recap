package com.company.exercise.accounts;

public abstract class Account {

    private double balance;
    private String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount; // balance = balance + amount
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds");
            return; // terminate method execution
        }
        balance -= amount; // balance = balance - amount
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
