package Models;

import java.text.DecimalFormat;
import java.util.Random;

public class Products {
    private int productId;
    private String productName;
    private String productDescription;
    private Enum<Category> productCategory;
    private int productQuantity;
    private double productPrice;
    public double amount;

    public Products() {

    }

    public Products(Integer pId, String pName, String pDescription, Enum<Category> pCategory, int pQuantity, double pPrice) {
        productId = pId;
        productName = pName;
        productDescription = pDescription;
        productCategory = pCategory;
        productQuantity = pQuantity;
        productPrice = pPrice;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(Integer pId) { productId = pId; }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String pName) {
        productName = pName;
    }

    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String pDescription) {
        productDescription = pDescription;
    }

    public Enum<Category> getCategory() { return productCategory; }
    public void setProductCategory(Enum<Category> pCategory) { productCategory = pCategory; }

     public int getProductQuantity() {
        return productQuantity;
     }
     public int setProductQuantity(int quantity) {
        return productQuantity = Math.max(quantity, 0);
     }

     public double getProductPrice() {
        return productPrice;
     }

     public double setProductPrice(double pPrice) {
        return productPrice = Math.max(pPrice, 0.00);
     }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "%d %-15s\t%-20s\t%5d\t%5s\t\t%-10s".formatted(this.productId, this.productName, this.productDescription,
                this.productQuantity, this.productPrice, df.format(this.productPrice * this.productQuantity));
    }
}

