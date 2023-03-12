package com.company.exercise.accounts;

public class BankTest {
    public static void main(String[] args) {
        Bank federalReserve = new Bank(6);

        String accountA = "EE234433";
        String accountB = "422342ABC";

        federalReserve.addAccount(new SavingsAccount(accountA, 4));
        federalReserve.addAccount(new CheckingAccount(accountB));

        System.out.println(federalReserve.getBalance(accountB));
        federalReserve.deposit(accountB, 200);
        System.out.println(federalReserve.getBalance(accountB));

        federalReserve.withdraw(accountA, 50);






    }
}
