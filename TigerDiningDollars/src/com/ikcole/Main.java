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
            System.out.printf("Welcome %s, what would you like to do?\n", user.getFirstName());
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
            case 5:
                scan.nextLine();
                break;
        }

        if (choice != 5) { // redisplay menu
            Main.printUserMenu(user, scan);
        }
    }

    /**
     * Show the transaction history for an account
     * @param theUser   the logged-in User object
     * @param scan      the Scanner object used for user input
     */
    public static void showTransHistory(User theUser, Scanner scan) {
        int theAcc;
        // get account whose transaction history to look at
        do {
            System.out.printf("Enter the number (1-%d) of the account\n whose transactions you wanna see: ", theUser.numAccounts());
            theAcc = scan.nextInt() - 1;
            if (theAcc < 0 || theAcc >= theUser.numAccounts()) {
                System.out.println("Error: Invalid account. Please try again");
            }
        } while (theAcc < 0 || theAcc >= theUser.numAccounts());

        // print the transaction history
        theUser.printActTransHistory(theAcc);
    }

    public static void withdrawalFunds(User theUser, Scanner scan) {
        int fromAcct;
        double amount, acctBal;
        String memo;

        do {
            System.out.printf("Enter the number (1-%d) of the account\n to withdraw from: ", theUser.numAccounts());
            fromAcct = scan.nextInt() - 1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account, Cannot transfer");
            }
        } while (fromAcct < 0 || fromAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(fromAcct);

        do {
            System.out.printf("Enter the amount to withdraw (max $%.02f): $", acctBal);
            amount = scan.nextDouble();
            if (amount < 0 ) {
                System.out.println("Amount must be greater than zero");
            } else if (amount > acctBal) {
                System.out.printf("Amount must not be greater than balance of $%.02f\n.", acctBal);
            }
        } while (amount < 0 || amount > acctBal);

        // gabble up rest of previous input
        scan.nextLine();
        System.out.println("Enter a memo: ");
        memo = scan.nextLine();

        // do the withdrawal
        theUser.addAcctTransaction(fromAcct, -1*amount, memo);
    }

    /**
     *  Transfer the amount from account to other account
     * @param theUser   the logged-in User object
     * @param scan      the Scanner object used for user input
     */
    public static void transferFunds(User theUser, Scanner scan) {
        int fromAcct, toAcct;
        double amount, acctBal;

        do {
            System.out.printf("Enter the number (1-%d) of the account\n to transfer from: ", theUser.numAccounts());
            fromAcct = scan.nextInt() - 1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account, Cannot transfer");
            }
        } while (fromAcct < 0 || fromAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(fromAcct);

        // get the account to transfer to
        do {
            System.out.printf("Enter the number (1-%d) of the account\nto transfer to: ", theUser.numAccounts());
            toAcct = scan.nextInt() - 1;
            if(toAcct < 0 || toAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account, cannot transfer to");
            }
        } while (toAcct < 0 || toAcct >= theUser.numAccounts());

        // get the amount to transfer
        do {
            System.out.printf("Enter the amount to transfer (max $%.02f): $", acctBal);
            amount = scan.nextDouble();
            if (amount < 0 ) {
                System.out.println("Amount must be greater than zero");
            } else if (amount > acctBal) {
                System.out.printf("Amount must not be greater than balance of $%.02f\n.", acctBal);
            }
        } while (amount < 0 || amount > acctBal);

        // finally transfer
        theUser.addAcctTransaction(fromAcct, -1*amount, String.format("Transfer to account %s",
                theUser.getAcctUID(toAcct)));
        theUser.addAcctTransaction(toAcct, amount, String.format("Transfer to account %s", theUser.getAcctUID(toAcct)));
    }

    /**
     *
     * @param theUser
     * @param scan
     */
    private static void depositFunds(User theUser, Scanner scan) {
        int toAcct;
        double amount, acctBal;
        String memo;

        do {
            System.out.printf("Enter the number (1-%d) of the account\n to deposit in: ", theUser.numAccounts());
            toAcct = scan.nextInt() - 1;
            if (toAcct < 0 || toAcct >= theUser.numAccounts()) {
                System.out.println("Invalid account, Cannot transfer");
            }
        } while (toAcct < 0 || toAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(toAcct);

        do {
            System.out.printf("Enter the amount to deposit (max $%.02f): $", acctBal);
            amount = scan.nextDouble();
            if (amount < 0 ) {
                System.out.println("Amount must be greater than zero");
            }
        } while (amount < 0);

        // gabble up rest of previous input
        scan.nextLine();
        System.out.println("Enter a memo: ");
        memo = scan.nextLine();

        // do the withdrawal
        theUser.addAcctTransaction(toAcct, amount, memo);
    }
}
