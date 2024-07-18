import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentGrouping departmentGrouping = new DepartmentGrouping();

        System.out.println("Enter the number of details");
        int numberOfDetails = scanner.nextInt();
        scanner.nextLine(); 

        if (numberOfDetails <= 0) {
            System.out.println(numberOfDetails + " is an invalid input");
            return;
        }

        System.out.println("Enter the details");
        for (int i = 0; i < numberOfDetails; i++) {
            String details = scanner.nextLine();
            departmentGrouping.addEmployeeId(details);
        }

        HashSet<String> result = departmentGrouping.findDepartmentNameWithEmployeeId();
        if (result.isEmpty()) {
            System.out.println("All the provided employee ids are invalid");
        } else {
            for (String entry : result) {
                System.out.println(entry);
            }
        }
    }
}
