package com.ikcole.Models;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Account> accounts;

    /**
     * Create a new Bank object with blank list of users and accounts
     * @param name  the name of the Bank
     */
    public Bank(String name) {
        this.name = name;
        this.users = new ArrayList<User>();
        this.accounts = new ArrayList<Account>();
    }

    public String getNewUserUID() {
        String uid = "";
        int length = 6;
        boolean nonUnique;
        do {
            for (int count = 0; count < length; count++) {
                uid += ((Integer)new Random().nextInt(10)).toString();
            }

            nonUnique = false;
            for (User unique : this.users) {
                if(uid.compareTo(unique.getUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }
        } while (nonUnique);

        return uid;
    }

    public String getNewAccountUID(){
        String uid = "";
        int length = 8;
        boolean nonUnique;
        do {
            for (int count = 0; count < length; count++) {
                uid += ((Integer)new Random().nextInt(10)).toString();
            }

            nonUnique = false;
            for (Account unique : this.accounts) {
                if(uid.compareTo(unique.getUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }
        } while (nonUnique);

        return uid;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public User addUser(String firstName, String lastName, String password) {
        User newUser = new User(firstName, lastName, password, this);
        this.users.add(newUser);

        // Create a saving acc for the user
        Account newAccount = new Account("Saving", newUser, this);
        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);

        return newUser;
    }

    public User userLogin(String userID, String password) {
        for (User user : this.users) {
            if (user.getUID().compareTo(userID) == 0 && user.validatePassword(password)) {
                return user;
            }
        }

        return null;
    }

    public String getName() {
        return this.name;
    }
 }
