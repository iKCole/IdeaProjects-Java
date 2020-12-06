package Models;

import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

public class Product {
    private Integer productID;
    private String productName;
    private BigDecimal productPrice;
    private int productStock;

    public Product() {}

    public Product(Integer productID, String productName, BigDecimal productPrice, int productStock) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = (11 * hash) + Objects.hashCode(this.productID);
        hash = (11 * hash) + Objects.hashCode(this.productName);
        hash = (11 * hash) + Objects.hashCode(this.productPrice);
        hash = (11 * hash) + Objects.hashCode(this.productStock);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Product otherProduct = (Product) object;

             return equalsOther(otherProduct);
    }

    private boolean equalsOther(Product otherProduct) {
        if (!Objects.equals(this.productID, otherProduct.productID)) {
            return false;
        }
        if (!Objects.equals(this.productName, otherProduct.productName)) {
            return false;
        }
        if (!Objects.equals(this.productPrice, otherProduct.productPrice)) {
            return false;
        }
        if (!Objects.equals(this.productStock, otherProduct.productStock)) {
            return false;
        }
        return true;
    }
}
