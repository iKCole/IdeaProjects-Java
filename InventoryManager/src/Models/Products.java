package Models;

public class Products {
    private static String productName;
    private static String productDescription;
    private static Enum<Category> productCategory;
    private static int reOrderPoint = 0;

    public Products() {

    }

    public Products(String pName, String pDescription, Enum<Category> pCategory) {
        productName = pName;
        productDescription = pDescription;
        productCategory = pCategory;
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

}
