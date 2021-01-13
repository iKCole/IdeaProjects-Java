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

    }
}
