package com.ikcole;

import Models.Student;
import Utilies.Create;

import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int selected = readSelectMenu(displayHeader());
        selectMenu(selected);
    }

    public static String displayHeader() {
        System.out.println("-------- Welcome to Col University ----------");
        System.out.println("1. Students\t2. Courses\t3. Instructors\t4. Departments");
        return read.next();
    }

//    public static boolean isNumeric(String read) {
//        try {
//            int readNum = Integer.parseInt(read);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }

    public static int readSelectMenu(String read) {
        try {
            return Integer.parseInt(read);
       } catch (NumberFormatException e) {
           System.out.println(read + " is not a valid selection. Must be numeric.");
       }
       return 0;
    }

    public static void selectMenu(int select) {
        switch (select) {
            case 1:
                studentContext();
                Student newStudent = new Student(read.next(), read.next());
                newStudent.displayInfo();
                break;
            case 2:
                courseContext();
                break;
            case 3:
                instructorsContext();
                break;
            case 4:
                deptContext();
                break;
            default:
                break;
        }
    }

    public static void studentContext() {
        System.out.println("1. List\t2. Create\t3. Update\t4. Delete\t0. Back to Menu");
    }

    public static void courseContext() {
        System.out.println("1. List\t2. Create\t3. Update\t4. Delete\t0. Back to Menu");
    }

    public static void instructorsContext() {
        System.out.println("1. List\t2. Create\t3. Update\t4. Delete\t0. Back to Menu");
    }

    public static void deptContext() {
        System.out.println("1. List\t2. Create\t3. Update\t4. Delete\t0. Back to Menu");
    }
}
