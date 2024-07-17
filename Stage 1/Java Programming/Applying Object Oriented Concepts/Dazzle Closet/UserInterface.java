import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dress details
        System.out.println("Enter dress code");
        String dressCode = scanner.nextLine();

        System.out.println("Enter dress style");
        String style = scanner.nextLine();

        System.out.println("Enter dress material");
        String material = scanner.nextLine();

        System.out.println("Enter dress price");
        double price = Double.parseDouble(scanner.nextLine());

        Order order = null;
         
        while (true) {
            System.out.println("Prefered size is XL(Yes/No)");
            String sizePreference = scanner.nextLine().trim().toLowerCase();       
            if (sizePreference.equals("yes")) {
                order = new Order(dressCode, style, material, price);
                break;
            } else if(sizePreference.equals("no")) {
                System.out.println("Enter the dress size");
                String size = scanner.nextLine().trim();
            
                if (size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL") || size.equalsIgnoreCase("XXXXL")) {
                    price += 100;
                }
                order = new Order(dressCode, style, material, size, price);
                break;
            }else{
                System.out.println("Wrong Input");
            }
        }
        // Display order details
        System.out.println("Dress code :" + order.getDressCode());
        System.out.println("Dress Style :" + order.getStyle());
        System.out.println("Material Type :" + order.getMaterial());
        System.out.println("Dress Size :" + order.getSize());
        System.out.println("Price :" + order.getPrice());
    }
}
