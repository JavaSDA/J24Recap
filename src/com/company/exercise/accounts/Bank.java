package com.company.exercise.accounts;

public class Bank {
    private Account[] accounts;
    private int numOfAccounts;

    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        numOfAccounts = 0;
    }

    public void addAccount(Account account) {
        accounts[numOfAccounts] = account;
        numOfAccounts++;
    }

    public Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                account = accounts[i];
            }
        }
        if (account == null) {
            throw new IllegalArgumentException("Account (" + accountNumber + ") was not found");
        }
        return account;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public void getBalance(String accountNumber) {
        try {
            Account account = findAccount(accountNumber);
            if (account != null) {
                System.out.println(accountNumber + " balance: " + account.getBalance());
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
