package Models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Orders {
    private int orderId;
    private static String orderTypes;
    private static LocalDate orderDate;
    private static Date expectedDate;
    private static String supplyPartner;
    private static String productName;
    private static int quantity;
    private static double unitPrice;
    private static double amount;

    public String getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(String orderTypes) {
        Orders.orderTypes = orderTypes;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate() {
        orderDate = LocalDate.now();
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        Orders.expectedDate = expectedDate;
    }

    public String getSupplyPartner() {
        return supplyPartner;
    }

    public void setSupplyPartner(String supplyPartner) {
        Orders.supplyPartner = supplyPartner;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        Orders.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        Orders.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        Orders.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount() {
        Orders.amount = ( unitPrice * quantity );
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        Random random = new Random();
        this.orderId = random.nextInt(133);
    }
}
