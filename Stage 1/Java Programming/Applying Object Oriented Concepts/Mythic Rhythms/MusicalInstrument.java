public abstract class MusicalInstrument {
    protected int instrumentId;
    protected String instrumentName;
    protected String instrumentType;
    protected double price;
    protected Customer customerObj;

    public MusicalInstrument(int instrumentId, String instrumentName, String instrumentType, double price, Customer customerObj) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.price = price;
        this.customerObj = customerObj;
    }

    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomerObj() {
        return customerObj;
    }

    public void setCustomerObj(Customer customerObj) {
        this.customerObj = customerObj;
    }

    public abstract double calculateTotalBill();
}
