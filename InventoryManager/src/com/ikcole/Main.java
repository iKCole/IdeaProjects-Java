package com.ikcole;

import Models.Category;
import Models.Products;
import Utility.addProducts;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    *   Build a console-based manager for managing inventory and sales such as buying products
    *  from suppliers and selling to customers.
    *
    * */
    static Scanner userReadKey = new Scanner(System.in);
    static Products product = new Products();
    static addProducts saveProductDetails = new addProducts();

    public static void main(String[] args) {
	// write your code here
        try {
            addProducts();
            System.out.println(product);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int mainMenu() {
        System.out.println("__________ Inventory Manager ____________\n1. Products\t 2. Orders\t 3. View Reports \t 0. Exit");
        return userReadKey.nextInt();
    }

    public static String readTexts() throws IOException {
        BufferedReader readInput = new BufferedReader( new InputStreamReader(System.in));
        return readInput.readLine();
    }

    public static void addProducts() throws IOException {
        Random randomID = new Random();
        System.out.println("----- ADD NEW PRODUCT ------");
        System.out.print(">| Name: ");
        product.setProductName(userReadKey.nextLine());
        System.out.print(">| Brief Description (Max 50): ");
        product.setProductDescription(readTexts());
        System.out.print(">| ID (Only numeric): ");
        int number = userReadKey.nextInt();
        product.setProductId((number > 10) ? number : randomID.nextInt(100));
        System.out.print("""
                --- Category Option ---
                1. Electronic\t2. Clothing \t 3. Books\t4. Others
                Please choose using a first letter (E, C, B, O): """);
        product.setProductCategory(categorySelect(userReadKey.next().toUpperCase()));
        System.out.print(">| Price: ");
        product.setProductPrice(userReadKey.nextDouble());
        System.out.print("Quantity: ");
        product.setProductQuantity(userReadKey.nextInt());
        saveProductDetails.addProduct(product);
    }

    public static Category categorySelect(String firstLetter) {
        switch (firstLetter) {
            case "E":
                return Category.ELECTRONIC;
            case "C":
                return Category.CLOTHING;
            case "B":
                return Category.BOOKS;
            case "O":
                return Category.OTHERS;
            default:
                System.out.println("Error: Please you must select using only first letter.");
                break;
        }
        return null;
    }

    public static void productOptions() {

    }

}
