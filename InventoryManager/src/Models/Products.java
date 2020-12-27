package Models;

public class Products {
    private static String productName;
    private static String productDescription;
    private static Enum<Category> productCategory;
    private static int productQuantity;
    private static int reOrderPoint = 0;

    public Products() {

    }

    public Products(String pName, String pDescription, Enum<Category> pCategory, int pQuantity) {
        productName = pName;
        productDescription = pDescription;
        productCategory = pCategory;
        productQuantity = pQuantity;
    }

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

    public  int getReOrderPoint() {
        return reOrderPoint;
    }
     public void setReOrderPoint(int quantitySold) {
        reOrderPoint -= quantitySold;
     }

     public int getProductQuantity() {
        return productQuantity;
     }
     public int setProductQuantity(int quantity) {
        return productQuantity = Math.max(quantity, 0);
     }

    @Override
    public String toString() {
        return String.format("%-15s %15s %d %n", this.getProductName(), this.getProductDescription(),
                this.getProductQuantity());
    }
}

