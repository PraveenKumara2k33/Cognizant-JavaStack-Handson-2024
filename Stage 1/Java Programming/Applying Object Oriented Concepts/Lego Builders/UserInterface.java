import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Product Id");
        String productId = scanner.nextLine();

        System.out.println("Enter the Product Type");
        String productType = scanner.nextLine();

        if (!productType.equalsIgnoreCase("ElectricalItem") && !productType.equalsIgnoreCase("PlumbingItem")) {
            System.out.println(productType + " is an invalid product type");
            return;
        }

        System.out.println("Enter the Product Name");
        String productName = scanner.nextLine();

        System.out.println("Enter the Quantity");
        int quantity = scanner.nextInt();

        System.out.println("Enter the Price");
        double price = scanner.nextDouble();

        LegoBuilders item;
        if (productType.equalsIgnoreCase("ElectricalItem")) {
            item = new ElectricalItemDetails(productId, productType, productName, quantity, price);
        } else {
            item = new PlumbingItemDetails(productId, productType, productName, quantity, price);
        }

        double billAmount = item.calculateTotalBill();
        if (billAmount == 0) {
            System.out.println("Product not available");
        } else {
            System.out.println("Bill Amount is " + billAmount);
        }

        scanner.close();
    }
}
