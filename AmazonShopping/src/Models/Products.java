package Models;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> products = new ArrayList<Product>();

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> viewAllProducts() {
        return products;
    }

}
