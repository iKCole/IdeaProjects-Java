package com.ikcole.Models;

import java.time.LocalDate;
import java.util.*;

public class Student {
    Integer id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;

    public Student() {}

    public Student(int id, String firstName, String lastName, String emailAddress, String password) {
        this.id = id;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmailAddress(emailAddress);
        this.setPassword(password);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Random random = new Random();
        Calendar calYear = new GregorianCalendar();
        this.id = (id <= 0) ? random.nextInt(100) + calYear.get(Calendar.YEAR): id + calYear.get(Calendar.YEAR);
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String generateEmail() {
        return firstName.substring(0, 2) + lastName.substring(lastName.length() - 2) + id + "@java.edu";
    }

    public String setRandomPassword(int length) {
        String characterSet = "ABCDEFGHIJKLMNOPRSTUVWXYZ0123456789!@#$&*_";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int random = (int) (Math.random() * characterSet.length());
            password[i] = characterSet.charAt(random);
        }
        return new String(password);
    }


    @Override
    public String toString() {
        return ">> Info you have entered <<\nStudent ID: " + id + "\tStudent Name: " + firstName + " " + lastName +
                "\tStudent Email: " + emailAddress;
    }
}
