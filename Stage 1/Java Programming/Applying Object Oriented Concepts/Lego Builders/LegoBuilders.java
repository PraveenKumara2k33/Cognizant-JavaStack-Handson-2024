public abstract class LegoBuilders {
    protected String productId;
    protected String productType;

    //Include the two arguments constructor here
    public LegoBuilders(String productId, String productType) {
        this.productId = productId;
        this.productType = productType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    //Include the Abstract method here
    public abstract double calculateTotalBill();
}
