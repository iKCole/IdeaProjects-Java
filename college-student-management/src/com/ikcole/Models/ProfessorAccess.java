package com.ikcole.Models;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorAccess {
    private final List<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    static Student student = new Student();

    public ProfessorAccess() { }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void addStudent() {
        System.out.print("Enter Student ID: ");
        student.setId(Integer.parseInt(sc.next()));
        student.setFirstName(readData("Enter Student's First Name: "));
        student.setLastName(readData("Enter Student's Last Name: "));
        System.out.print(">>> New Email and Password will be set for this.\n\t >| Enter No. of characters for " + "password: ");
        student.setPassword(student.setRandomPassword(sc.nextInt()));
        student.setEmailAddress(student.generateEmail());

        studentList.add(student);
    }

    public void viewAllStudent() {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s %20s %20s", "FULL NAME", "EMAIL", "PASSWORD\n");
        System.out.println("---------------------------------------------------------------");
        for(Student student : studentList) {
            System.out.format("%-20s %20s %20s", (student.getFirstName() + " " + student.getLastName()),
                    student.getEmailAddress(), student.getPassword());
        }
    }

    public String readData(String read) {
        System.out.print(read);
        return sc.next();
    }



}
