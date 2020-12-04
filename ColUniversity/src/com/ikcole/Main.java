package com.ikcole;

import Models.Student;
import Utilies.Create;
import Utilies.MenuOption;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner READ = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int selected = readSelectMenu(displayHeader());
        selectMenu(selected);
    }

    public static String displayHeader() {
        System.out.println("-------- Welcome to Col University ----------");
        System.out.println("1. Students\t2. Courses\t3. Instructors\t4. Departments");
        return READ.next();
    }
    private static List<MenuOption> menuMainOptions = List.of(
            new MenuOption(1, "Manage Students"),
            new MenuOption(2, "Manage Courses"),
            new MenuOption(3, "Manage Instructors"),
            new MenuOption(4, "Manage Department"),
            new MenuOption(9, "Exit program")
    );

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
