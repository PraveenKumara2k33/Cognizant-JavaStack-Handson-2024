import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        System.out.println("Enter the department");
        String department = scanner.nextLine();

        System.out.println("Enter the experience");
        int experience = scanner.nextInt();

        ArrayList<Employee> employees = system.viewEmployeesByDepartmentAndExperience(department, experience);

        if (employees.isEmpty()) {
            System.out.printf("No employee records available for the %s department and %d years of experience%n", department, experience);
        } else {
            System.out.println("EMPLOYEEID EMPLOYEENAME DEPARTMENT SALARY EXPERIENCE");
            for (Employee employee : employees) {
                System.out.printf("%d %s %s %.1f %d%n", employee.getEmployeeId(), employee.getEmployeeName(), employee.getDepartment(), employee.getSalary(), employee.getExperience());
            }
        }

        scanner.close();
    }
}
