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
        System.out.print(">>> New Email and Password will be set for this student.\n >| Enter No. of characters for" +
                " " + "password: ");
        student.setPassword(student.setRandomPassword(sc.nextInt()));
        student.setEmailAddress(student.generateEmail());
        System.out.println(student.toString());
        studentList.add(new Student(student.getId(), student.getFirstName(), student.getLastName(), student.getEmailAddress(), student.getPassword()));
    }

    public void viewAllStudent() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-12s %-20s %-20s %-20s", "STUDENT ID", "NAME", "EMAIL ID", "PASSWORD");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------");
        for(Student student : studentList) {
            System.out.format("%-12s %-20s %-20s %-20s\n",
                    student.getId(), (student.getFirstName() + " " + student.getLastName()), student.getEmailAddress(), student.getPassword());
        }
    }

    public void viewById() {
        int findId = Integer.parseInt(readData("Enter Student ID to View Information: "));
        for(Student studentByID : studentList) {
            if(findId == studentByID.getId()) {
                System.out.println("----------------- Student Info for ID " + findId + "--------------------");
                System.out.println("----------------------------------------------------------------------------");
                System.out.printf("%8s %-20s %-20s %-20s", "STUDENT ID", "NAME", "EMAIL ID", "PASSWORD");
                System.out.println("");
                System.out.println("----------------------------------------------------------------------------");
                System.out.format("%8s %-20s %-20s %-20s", student.getId(),
                        (student.getFirstName() + " " + student.getLastName()), student.getEmailAddress(), student.getPassword());
            }
        }
    }

    public void removeStudent(int id) {
        studentList.removeIf(n -> n.getId() == id);
        viewAllStudent();
    }

    public String readData(String read) {
        System.out.print(read);
        return sc.next();
    }

}
