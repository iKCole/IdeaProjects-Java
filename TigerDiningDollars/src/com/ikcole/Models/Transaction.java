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
}
