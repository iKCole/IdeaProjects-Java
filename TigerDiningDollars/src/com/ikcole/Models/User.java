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
     * @param theBank   the Bank object that the user is a member of
     */
    public User(String firstName, String lastName, String password, Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Store the password's hash for security reason
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MDS");
            this.passwordHash = messageDigest.digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("ERROR: ");
            e.printStackTrace();
            System.exit(1);
        }

        // get a new, unique ID for the user
        this.UID = theBank.getNewUserUID();

        // Create account lists (empty)
        this.accounts = new ArrayList<>();

        System.out.printf("\nNew user: %s, %s with ID %s created. \n", lastName, firstName, this.UID);
    }
}
