package Models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> cartProducts = new ArrayList<Product>();

    private Product getProductByProductID(int productID) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getProductID() == productID) {
                product = prod;
                break;
            }
        }
        return product;
    }

    public void addToCartByProductID(int productID) {
        Product product = getProductByProductID(productID);
        addToCart(product);
    }

    public void addToCart(Product product) {
        cartProducts.add(product);
    }

    public void removeProduct(int productID) {
        Product rProduct = getProductByProductID(productID);
        cartProducts.remove(rProduct);
    }

    public void printCartProduct() {
        for (Product pProduct: cartProducts) {
            System.out.println(pProduct.getProductName() + "has been added to cart.");
        }
    }
}
