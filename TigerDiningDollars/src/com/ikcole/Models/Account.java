package com.ikcole.Models;

import java.util.ArrayList;

public class Account {

    /**
     * The name of the account.
     */
    private String name;

    /**
     * The current balance of the account
     */
    private double balance;

    /**
     * The account ID number
     */
    private String UID;

    /**
     * The User object that owns this account
     */
    private User holder;

    /**
     * The list of transactions for this account.
     */
    private ArrayList<Transaction> transactions;

    public Account(String name, User holder, Bank bank) {
        this.name = name;
        this.holder = holder;

        // get new acc UID;
        this.UID = bank.getNewAccountUID();

        // initialize transactions
        this.transactions = new ArrayList<Transaction>();

    }

    public String getUID() {
        return this.UID;
    }

    public String getSummaryLine() {
        double balance = this.getBalance();

        if (this.balance >= 0) {
            return String.format("%s : $%.02f : %s", this.UID, balance, this.name);
        }
        else {
            return String.format("%s : $(%.02f) : %s", this.UID, balance, this.name);
        }
    }

    /**
     * Get the balance of this account by adding the amount of the transactions
     * @return the balance value
     */
    public double getBalance() {
        double balance = 0;
        for (Transaction t : this.transactions) {
            balance += t.getAmount();
        }
        return balance;
    }

    /**
     * Print the transaction history of the account
     */
    public void printTransHistory() {
        System.out.printf("\nTransaction history for account %s\n", this.UID);
        for (int t = this.transactions.size()-1; t >= 0 ; t--) {
            System.out.printf(this.transactions.get(t).getSummaryLine());
        }

        System.out.println();
    }
}
