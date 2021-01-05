package com.ikcole.Models;

import java.util.Scanner;

public class StudentAccess {
    private final Student student = new Student();
    private final ProfessorAccess authStudent = new ProfessorAccess();
    Scanner read = new Scanner(System.in);

    public void studentAccess() {
        System.out.println("\nEnter your Email: ");
        String email = read.nextLine();
        System.out.println("Enter your Password: ");
        String password = read.nextLine();
        for(Student matchBy : authStudent.getStudentList()) {
            if(!email.equals(matchBy.getEmailAddress())) {
                System.out.println("Invalid Email or Password");
            }
            else {
                System.out.println("\n Login Successful\n Here is your Student Profile");
//                authStudent.displayHeader();
//                System.out.format("%-12s %-15s %-20s %-20s", student.getId(),
//                        (student.getFirstName() + " " + student.getLastName()), student.getEmailAddress(), student.getPassword());
            }
        }
    }

}
