package com.ikcole;

import Models.Cart;
import Models.Product;
import Models.Products;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner READ = new Scanner(System.in);
    static Product product = new Product();
    static Products productStore = new Products();
    static List<Product> productList = new ArrayList<>();
    static Cart cart = new Cart();
    static int choice = 0;

    public static void main(String[] args) {
        mainMenu();
    }

    private static int scanUserInput() throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        choice = Integer.parseInt(input.nextLine());
        return choice;
    }

    public static void startConsole() {
        System.out.println("1. Display Products\n2. Display Cart\n3. Exit");
    }

    public static void mainMenu() {
        do {
            startConsole();
            scanUserInput();

            switch (choice) {
                case 1:
                    printStoreProducts();
                    productOptions();
                    scanUserInput();
                    editOptions();
                    break;
                case 2:
                    printCart();
                    break;
                case 3:
                    System.exit(3);
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }

    public static void productOptions() {
        System.out.println("1. Add \n2. Remove \n3. Exit");
    }

    private static  void editOptions() {
        switch (choice) {
            case 1:
                addProductStore();
                viewProductDetails();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                break;
        }
    }

    private static void printStoreProducts() {
        List<Product> products = new Products().getProducts();
        for(Product p: products) {
            System.out.println(p.getProductID() + "... " + p.getProductName() + " " + p.getProductPrice() + " " + p.getProductStock());
        }
    }

    public static void addProductStore() {
        Random random = new Random();
            System.out.println("\n\t***** Add item *****");
            product.setProductID(random.nextInt(100));
            System.out.print("Enter the name of the item you want to add: ");
            product.setProductName(READ.nextLine());
            System.out.print("Enter the price: ");
            product.setProductPrice(BigDecimal.valueOf(READ.nextDouble()));
            System.out.print("How many " + product.getProductName() + " are in stock: ");
            product.setProductStock(Integer.parseInt(READ.next()));
            productStore.addProduct(product);
    }

    public static void viewProductDetails() {
        System.out.println(" **** Product List ****");
        productList = productStore.viewAllProducts();
        for (Product list: productList
             ) {
            System.out.println("==| " + list.getProductID() + "\t" + list.getProductName() + "\t" + list.getProductPrice() +
                    "\t" + list.getProductStock());
        }
    }

    public static void addProductToCart() {
        int productID = scanUserInput();
        cart.addToCartByProductID(productID);
    }

    public static  void removeProductFromCart() {
        int productID = scanUserInput();
        cart.removeProduct(productID);
    }

    public static void printCart() {
        cart.printCartProduct();
    }
}
