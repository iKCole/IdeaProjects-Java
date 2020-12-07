package com.ikcole;

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

    public static void main(String[] args) {
        addProductStore();
        viewProductDetails();

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
}
