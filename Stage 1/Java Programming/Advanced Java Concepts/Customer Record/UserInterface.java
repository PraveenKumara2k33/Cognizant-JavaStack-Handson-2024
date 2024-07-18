import java.util.Scanner;

public class UserInterface {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the customer id");
        String id = sc.nextLine();
        
        System.out.println("Enter the customer name");
        String name = sc.nextLine();
        
        System.out.println("Enter the email");
        String email = sc.nextLine();
        
        System.out.println("Enter the phoneNo");
        String phoneNo = sc.nextLine();
        
        Customer customer = new Customer(id, name, email, phoneNo);
        CustomerManagementSystem cms = new CustomerManagementSystem();
        
        int result = cms.insertCustomerRecordsToDB(customer);
        
        if (result == 1) {
            System.out.println("Customer record is added successfully");
        } else {
            System.out.println("Failed to add Customer record");
        }
        
        sc.close();
    }
}
