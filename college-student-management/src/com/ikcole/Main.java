package com.ikcole;

import com.ikcole.Models.ProfessorAccess;
import com.ikcole.Models.Student;
import com.ikcole.Models.StudentAccess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner scan = new Scanner(System.in);
        ProfessorAccess test = new ProfessorAccess();
        StudentAccess testB = new StudentAccess();
        Boolean quit = false;


        System.out.println("Enter any key to continue or Press Q to quit.");
        do {
            String enterKey = scan.nextLine().toUpperCase();
            if(enterKey.equals("Q")) {
                break;
            }
            test.addStudent();
        } while (!quit);

        testB.studentLogin(test.getStudentList());
    }
}
