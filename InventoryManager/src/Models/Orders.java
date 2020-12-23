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

    public static String getOrderTypes() {
        return orderTypes;
    }

    public static void setOrderTypes(String orderTypes) {
        Orders.orderTypes = orderTypes;
    }

    public static LocalDate getOrderDate() {
        return orderDate;
    }

    public static void setOrderDate() {
        Orders.orderDate = LocalDate.now();
    }

    public static Date getExpectedDate() {
        return expectedDate;
    }

    public static void setExpectedDate(Date expectedDate) {
        Orders.expectedDate = expectedDate;
    }

    public static String getSupplyPartner() {
        return supplyPartner;
    }

    public static void setSupplyPartner(String supplyPartner) {
        Orders.supplyPartner = supplyPartner;
    }

    public static String getProductName() {
        return productName;
    }

    public static void setProductName(String productName) {
        Orders.productName = productName;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Orders.quantity = quantity;
    }

    public static double getUnitPrice() {
        return unitPrice;
    }

    public static void setUnitPrice(double unitPrice) {
        Orders.unitPrice = unitPrice;
    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount() {
        Orders.amount = ( unitPrice * quantity );
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(Random random) {
        this.orderId = random.nextInt(1000);
    }
}
