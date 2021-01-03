package Utility;

import Models.Products;

import java.util.ArrayList;
import java.util.List;

public class addProducts {
    private List<Products> products = new ArrayList<>();

    public void addProduct(Products product) {
        products.add(product);
    }

    public List<Products> printProduct() {
        return products;
    }
}
