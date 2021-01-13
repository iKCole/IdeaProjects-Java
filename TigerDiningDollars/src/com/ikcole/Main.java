package com.ikcole;

import com.ikcole.Models.Account;
import com.ikcole.Models.Bank;
import com.ikcole.Models.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Initialize Scanner
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("Tiger D'ing Dollars");

        User aUser = bank.addUser("Dan", "Maa", "1234");
        Account newAccount = new Account("Checking", aUser, bank);
        aUser.addAccount(newAccount);
        bank.addAccount(newAccount);

        User currentUser;
        while (true) {
            currentUser = Main.mainMenuPrompt(bank, scan);
            Main.printUserMenu(currentUser, scan);
        }
    }

    /**
     * Display the Main's login menu
     * @param bank  the bank object whose accounts to use
     * @param scan  the Scanner object to use for user input
     * @return      the authenticated User object
     */
    public static User mainMenuPrompt(Bank bank, Scanner scan) {
        String userID, password;
        User authUser;

        do {
            System.out.printf("\nWelcome to %s\n", bank.getName());
            System.out.print("Enter user ID: ");
            userID = scan.nextLine();
            System.out.print("Enter password: ");
            password = scan.nextLine();

            authUser = bank.userLogin(userID, password);
            if (authUser == null) {
                System.out.println("Incorrect login, Please try again");
            }
        } while (authUser == null);

        return authUser;
    }

    public static void printUserMenu(User user, Scanner scan) {
        user.printAccountsSummary();

        int choice;
        do {
            System.out.printf("Welcome %s, what would you like to do?", user.getFirstName());
            System.out.println(" 1. Show account transaction history");
            System.out.println(" 2. Withdrawal");
            System.out.println(" 3. Deposit");
            System.out.println(" 4. Transfer");
            System.out.println(" 5. Quit");
            System.out.println();
            System.out.println("Enter choice: ");
            choice = scan.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please choose 1-5");
            }
        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                Main.showTransHistory(user, scan);
                break;
            case 2:
                Main.withdrawalFunds(user, scan);
                break;
            case 3:
                Main.depositFunds(user, scan);
                break;
            case 4:
                Main.transferFunds(user, scan);
                break;
            default:
                break;
        }

        if (choice != 5) {
            Main.printUserMenu(user, scan);
        }
    }
}
