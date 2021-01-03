package Utility;

import Models.Orders;
import Models.Products;

import java.util.ArrayList;
import java.util.List;

public class ViewInfo {
    // current number of product available in the inventory
    private final static int productAvailable = 0;
    private final static int quantityOverall = 0;
    private final static int productReOrder = 0;

    // View report
    private static final List<Products> viewProducts = new ArrayList<>();
    private static List<Orders> viewOrders;

    public ViewInfo() {

    }

    public List<Products> viewAllProducts() {
        return viewProducts;
    }
}
