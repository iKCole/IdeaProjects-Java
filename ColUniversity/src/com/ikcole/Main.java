package com.ikcole;

import Manipulation.StudentDirectory;
import Models.Account;
import Models.Student;
import Utilies.Create;
import Utilies.MenuOption;

import java.util.*;

public class Main {

    private static final Scanner READ = new Scanner(System.in);
    static String[] saveData = new String[5];
    static StudentDirectory students = new StudentDirectory();

    public static void main(String[] args) {
        displayHeader();
        selectMenu(READ.nextInt());

    }

    public static void displayHeader() {
        System.out.println("-------- Welcome to Col University ----------");
        for (var displayList: menuMainOptions) {
            System.out.printf("%d. %s%n", displayList.number, displayList.menuLabel);
            System.out.println("Enter a menu option: ");
        }
    }
    private static List<MenuOption> menuMainOptions = List.of(
            new MenuOption(1, "Manage Students"),
            new MenuOption(2, "Manage Courses"),
            new MenuOption(3, "Manage Instructors"),
            new MenuOption(4, "Manage Department"),
            new MenuOption(9, "Exit program")
    );

    private static List<MenuOption> manageStudent = List.of(
            new MenuOption(1, "Add"),
            new MenuOption(2, "View"),
            new MenuOption(9, "Exit program")
    );

    static String[] formLabels = {
            "UID: ",
            "First Name: ",
            "Last Name: ",
            "Email: ",
            "Password: "
    };

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
                add();
                view();
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
        for (var viewOption: manageStudent
             ) {
            System.out.printf("%d. %s%n", viewOption.number, viewOption.menuLabel);
        }
    }

    public static void add() {
        int i = 0;
        while (i < 5) {
            System.out.print(formLabels[i]);
            saveData[i] = READ.next();
            i++;
        }
        Student student = new Student(Integer.parseInt(saveData[0]), saveData[1], saveData[2],
                Collections.singletonList(new Account(saveData[3], saveData[4])));
        students.addStudent(student);
    }

    public static void view(){
        for (Student view: students.viewStudents()
             ) {
            System.out.println(view.getStudent_id());
        }
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
