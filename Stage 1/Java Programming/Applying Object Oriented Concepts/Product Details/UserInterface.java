import java.util.Scanner;

// Define InvalidPriceException class


// Define UserInterface class
public class UserInterface {

    // Method to validate the product price
    public static boolean validateProductPrice(int price) throws InvalidPriceException {
        if (price >= 1 && price <= 20) {
            return true;
        } else {
            throw new InvalidPriceException("Product price is invalid");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of product entries");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        for (int i = 1; i <= numberOfEntries; i++) {
            System.out.println("Enter product " + i + " details");
            
            String productDetails = scanner.nextLine();
            String[] details = productDetails.split(":");
            String productCode = details[0];
            String productType = details[1];
            int productPrice = Integer.parseInt(details[2]);

            try {
                if (validateProductPrice(productPrice)) {
                    System.out.println("Stock updated");
                }
            } catch (InvalidPriceException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
