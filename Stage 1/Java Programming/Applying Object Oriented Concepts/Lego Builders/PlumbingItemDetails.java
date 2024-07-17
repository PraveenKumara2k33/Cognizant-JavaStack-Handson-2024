public class PlumbingItemDetails extends LegoBuilders {
    private String productName;
    private int quantity;
    private double price;

    public PlumbingItemDetails(String productId, String productType, String productName, int quantity, double price) {
        super(productId, productType);
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateTotalBill() {
        if (productName.toLowerCase().contains("tube") || productName.toLowerCase().contains("plumbingpipe")) {
            return quantity * price;
        }
        return 0;
    }
}