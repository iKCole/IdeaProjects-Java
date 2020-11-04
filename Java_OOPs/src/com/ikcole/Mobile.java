package com.ikcole;

import java.lang.reflect.Method;

public class Mobile extends Product {
    // Is a relation as Mobile is child inherited from Product parent

    // Additional Attributes
    String OS;
    int CapacitySize;
    int Ram;

    Mobile(){
        System.out.println(">> Mobile Object Constructed : Extend");
    }

    void setProductDetails(int pid, String name, double price, String os, int capacitySize, int ram)
    { // Method Overloading
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.OS = os;
        this.CapacitySize = capacitySize;
        this.Ram = ram;
    }

    void displayProductDetails(){
        System.out.println("---- Product ID: " + pid + " ----");
        System.out.println("Name:\t" + name);
        System.out.println("Price:\t" + price);
        System.out.println("OS:\t" + OS);
        System.out.println("Capacity:\t" + CapacitySize);
        System.out.println("RAM:\t" + Ram);
        System.out.println("---------- End ----------");
    }
}
