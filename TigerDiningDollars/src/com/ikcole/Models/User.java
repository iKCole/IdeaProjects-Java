package com.ikcole.Models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {
    /**
     * The first name of the user.
     */
    private String firstName;
    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The University ID number of the user.
     */
    private String UID;

    /**
     * The MDS hash of the user's password.
     */
    private byte passwordHash[];

    /**
     * The list of accounts for this particular user.
     */
    private ArrayList<Account> accounts;

    /**
     *  Create a new user
     * @param firstName the user's first name
     * @param lastName  the user's last name
     * @param password  the user's account password
     * @param bank   the Bank object that the user is a member of
     */
    public User(String firstName, String lastName, String password, Bank bank) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Store the password's hash for security reason
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            this.passwordHash = messageDigest.digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("ERROR: ");
            e.printStackTrace();
            System.exit(1);
        }

        // get a new, unique ID for the user
        this.UID = bank.getNewUserUID();

        // Create account lists (empty)
        this.accounts = new ArrayList<>();

        System.out.printf("<User.java> New user: %s, %s with ID %s created. \n", lastName, firstName, this.UID);
    }

    public String getUID() {
        return this.UID;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    /**
     * Verify whether a given password matches the User password
     * @param passwrd   the password to check
     * @return          whether the password is valid or not
     */
    public boolean validatePassword(String passwrd) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(messageDigest.digest(passwrd.getBytes()), this.passwordHash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: Invalidate Password");
            e.printStackTrace();
            System.exit(1);
        }

        return false;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void printAccountsSummary() {
        System.out.printf("\n%s's accounts summary\n", this.firstName);
        for (int acc = 0; acc < this.accounts.size(); acc++) {
            System.out.printf("%d) %s\n", acc+1, this.accounts.get(acc).getSummaryLine());
        }
        System.out.println();
    }

    public int numAccounts() {
        return this.accounts.size();
    }

    /**
     * Print transaction history for a particular account.
     * @param acctIdx   the index of the account to use
     */
    public  void printActTransHistory(int acctIdx) {
        this.accounts.get(acctIdx).printTransHistory();
    }

    public double getAcctBalance(int acctIdx) {
        return this.accounts.get(acctIdx).getBalance();
    }

    /**
     * Get the UID of a particular account
     * @param acctIdx   the index of the account to use
     * @return          the UID of the account
     */
    public String getAcctUID(int acctIdx) {
        return this.accounts.get(acctIdx).getUID();
    }

    public void addAcctTransaction(int acctIdx, double amount, String description) {
        this.accounts.get(acctIdx).addTransaction(amount, description);
    }
}
