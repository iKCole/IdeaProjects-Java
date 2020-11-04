package com.ikcole;

public class Main {

    public static void main(String[] args) {
        // Create an Object : Product
        Product product = new Product();
        // Product's reference variable that holds the hashCode of the object in hexadecimal notation, not an object
        System.out.println("product is: " + product);

        // Writing data in object - product
        product.setProductDetails(102, "iPhone 12 mini", 1099);
        // Reading data from the object - product
        product.displayProductDetails();

        //write data directly, but not very practical. To make properties of an object secure, make attributes private
        Product product1 = new Product();
//        product1.pid = 189;
        product1.setPid(189);
        product1.name = "iPhone 11 Pro";
        product1.price = 1999;
        product1.displayProductDetails();

        // ***** Mobile Class *****
        // Request to get Mobile object constructed
        System.out.println("\n==============================");
        System.out.println("\tMobile Class Behavior\n");
        Mobile mobile = new Mobile();
        mobile.setProductDetails(117, "Google Pixel 5", 499.99, "Andriod", 128, 8);
        mobile.displayProductDetails();
    }
}
