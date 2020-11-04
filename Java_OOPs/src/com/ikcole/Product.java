package com.ikcole;

public class Product {

    protected int pid;
    String name;
    double price;

    Product(){
        System.out.println(">> Product Object Constructed");
    }

    //Method -- To write data in Product Object
    void setProductDetails(int pid, String name, double price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    void displayProductDetails(){
        System.out.println("---- Product ID: " + pid + " ----");
        System.out.println("Name:\t" + name);
        System.out.println("Price:\t" + price);
        System.out.println("---------- End ----------");
    }

    // using a setter method
    void setPid(int pid){
        // read to the current object safely
        this.pid = pid;
    }
    // using a getter method
    int getPid(){
        return pid;
    }
}
