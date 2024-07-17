public class Investment {
    private int companyId;
    private String companyName;
    private static int noOfShares;
    private double valueOfOneShare;

    // Getters and Setters
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static int getNoOfShares() {
        return noOfShares;
    }

    public static void setNoOfShares(int noOfShares) {
        if (noOfShares > 0) {
            Investment.noOfShares = (noOfShares>0)?noOfShares:0;
        } 
    }

    public double getValueOfOneShare() {
        return valueOfOneShare;
    }

    public void setValueOfOneShare(double valueOfOneShare) {
        this.valueOfOneShare = valueOfOneShare;
    }

    // Method to calculate the total amount of investment
    public double calculateTotalAmountOfInvestment(int sharesBought) {
        if (sharesBought <= noOfShares) {
            noOfShares -= sharesBought;
            double totalAmount = sharesBought * valueOfOneShare;
            return Math.round(totalAmount * 10.0) / 10.0; // round to one decimal place
        } else {
            System.out.println("shares not available");
            return -1; // Indicating shares not available
        }
    }
}
