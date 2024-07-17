import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Customer Details
        System.out.println("Enter the Customer Details");
        String[] customerDetails = sc.nextLine().split(":");
        
        int customerId = Integer.parseInt(customerDetails[0]);
        String customerName = customerDetails[1];
        long mobileNumber = Long.parseLong(customerDetails[2]);

        Customer customer = new Customer(customerId, customerName, mobileNumber);

        // Input Musical Instrument Details
        System.out.println("Enter the musical Instrument Details");
        String[] instrumentDetails = sc.nextLine().split(":");
        int instrumentId = Integer.parseInt(instrumentDetails[0]);
        String instrumentName = instrumentDetails[1];
        String instrumentType = instrumentDetails[2];
        double price = Double.parseDouble(instrumentDetails[3]);
        int numberOfStrings = Integer.parseInt(instrumentDetails[4]);
        String stringMaterial = instrumentDetails[5];

        MusicalInstrument instrument = new StringInstrument(instrumentId, instrumentName, instrumentType, price, customer, numberOfStrings, stringMaterial);
        double totalBill = instrument.calculateTotalBill();

        if (totalBill == -1) {
            System.out.println("Invalid Input");
        } else {
            if (price > 20000) {
                System.out.println("You have a discount! and your Total Bill is " + totalBill);
            } else {
                System.out.println("Total Bill is " + totalBill);
            }
        }

        sc.close();
    }
}
