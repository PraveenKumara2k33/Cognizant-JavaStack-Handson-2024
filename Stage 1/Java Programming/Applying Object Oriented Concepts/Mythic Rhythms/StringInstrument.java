public class StringInstrument extends MusicalInstrument {
    private int numberOfStrings;
    private String stringMaterial;

    public StringInstrument(int instrumentId, String instrumentName, String instrumentType, double price, Customer customerObj, int numberOfStrings, String stringMaterial) {
        super(instrumentId, instrumentName, instrumentType, price, customerObj);
        this.numberOfStrings = numberOfStrings;
        this.stringMaterial = stringMaterial;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getStringMaterial() {
        return stringMaterial;
    }

    public void setStringMaterial(String stringMaterial) {
        this.stringMaterial = stringMaterial;
    }

    @Override
    public double calculateTotalBill() {
        double pricePerString = 0;
        if (stringMaterial.equalsIgnoreCase("Nylon")) {
            pricePerString = 15;
        } else if (stringMaterial.equalsIgnoreCase("Steel")) {
            pricePerString = 20;
        } else {
            return -1; // Invalid input
        }

        double totalBill = price + (pricePerString * numberOfStrings);

        if (price > 20000) {
            totalBill -= totalBill * 0.30;
        }

        setPrice(totalBill);
        return totalBill;
    }
}
