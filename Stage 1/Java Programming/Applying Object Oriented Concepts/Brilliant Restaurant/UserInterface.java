import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Enter the Name");
        String customerName = scanner.nextLine();

        System.out.println("Enter the Order Number");
        int orderNumber = Integer.parseInt(scanner.nextLine());
        scanner.nextLine(); // consume the newline

        System.out.println("Enter the Delivery Type");
        String deliveryType = scanner.nextLine();

        // Validate the delivery type
        if (!deliveryType.equals("HomeDelivery") && !deliveryType.equals("Parcel") && !deliveryType.equals("NormalOrder")) {
            System.out.println("Invalid Order Type");
            scanner.close();
            return;
        }

        System.out.println("Enter the Food Name");
        String foodName = scanner.nextLine();

        System.out.println("Enter the Phone Number");
        long phoneNumber = Long.parseLong(scanner.nextLine());

        System.out.println("Enter the price of the item");
        double cost =Double.parseDouble(scanner.nextLine());

        // Creating restaurant object
        Restaurant restaurant = new Restaurant(customerName, orderNumber, deliveryType, foodName, phoneNumber);

        // Calculating bill
        try {
            double billAmount = restaurant.calculateTotalBill(cost);

            // Display output
            System.out.println("Name " + restaurant.getCustomerName());
            System.out.println("Order Number " + restaurant.getOrderNumber());
            System.out.println("Delivery Type " + restaurant.getDeliveryType());
            System.out.println("Food Name " + restaurant.getFoodName());
            System.out.println("Phone Number " + restaurant.getPhoneNumber());
            System.out.println("Bill Amount " + billAmount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
