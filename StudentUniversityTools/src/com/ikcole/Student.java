package com.ikcole;

import java.util.Random;
import java.util.Scanner;

public class Student {
    private Integer UID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {

        this.password = generatePassword();
    }

    private static String generatePassword() {
        Scanner read = new Scanner(System.in);
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$";
        System.out.print("Enter the password lenght to generate: ");
        int charLength = read.nextInt();
        StringBuilder newPassword = new StringBuilder(charLength);
        for (int i = 0; i < charLength; i++) {
           newPassword.append(character.charAt((int) (character.length() * Math.random())));
        }
        return newPassword.toString();
    }
}
