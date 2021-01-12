package com.ikcole.Models;

import java.util.Date;

public class Transaction {

    /**
     * The amount of this transaction
     */
    private double amount;

    /**
     * The date and time of this transaction
     */
    private Date dateTime;

    /**
     * A description for this transaction
     */
    private String description;

    /**
     * The account in which the transaction was performed
     */
    private Account accountIn;

    /**
     * Create a new Transaction
     * @param amount    the amount transacted
     * @param accountIn in which account was transacted
     */
    public Transaction(double amount, Account accountIn) {
        this.amount = amount;
        this.accountIn = accountIn;
        this.dateTime = new Date();
        this.description = "";
    }

    /**
     * Create a new Transaction
     * @param amount        the amount transacted
     * @param description   the description for the transaction(memo)
     * @param accountIn     in which amount was transacted
     */
    public Transaction(double amount, String description, Account accountIn) {
        this(amount, accountIn);
        this.description = description;
    }

}
