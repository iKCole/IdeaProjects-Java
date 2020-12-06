package com.ikcole;

import Models.Product;
import Models.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner READ = new Scanner(System.in);
    static Product product = new Product();
    static Products productStore = new Products();

    public static void main(String[] args) {
        addProductStore();

    }

    public static void addProductStore() {
        int press;
        do {
            System.out.println("\n\t***** Add item *****");
            System.out.print("Enter the name of the item you want to add: ");
            product.setProductName(READ.nextLine());
            System.out.print("Enter the price: ");
            product.setProductPrice(READ.nextBigDecimal());
            System.out.print("How many " + product.getProductName() + " are in stock: ");
            product.setProductStock(Integer.parseInt(READ.next()));
            System.out.println("\nAdd more?\nPress 1 to continue\nPress 9 to exit");
            productStore.addProduct(product);
            press = Integer.parseInt(READ.next());
        } while (press != 9);
    }
}
