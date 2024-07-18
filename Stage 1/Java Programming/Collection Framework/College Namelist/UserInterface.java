import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student studentManager = new Student();
        int choice;

        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Remove");
            System.out.println("4.Exit");
            System.out.print("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student name");
                    String nameToAdd = scanner.nextLine();
                    studentManager.addStudentToList(nameToAdd);
                    break;

                case 2:
                    if (studentManager.getStudentList().isEmpty()) {
                        System.out.println("The student list is empty");
                    } else {
                        studentManager.sortStudentList();
                        for (String student : studentManager.getStudentList()) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    if (studentManager.getStudentList().isEmpty()) {
                        System.out.println("The student list is empty");
                    } else {
                        System.out.print("Enter the student name");
                        String nameToRemove = scanner.nextLine();
                        studentManager.removeStudentFromList(nameToRemove);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the application");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
