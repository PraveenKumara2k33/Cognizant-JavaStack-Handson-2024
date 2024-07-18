import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        if (numberOfStudents <= 0) {
            System.out.println("Invalid number of students");
            return;
        }

        List<Student> students = new ArrayList<>();
        System.out.println("Enter the student details:");
        for (int i = 0; i < numberOfStudents; i++) {
            String[] details = scanner.nextLine().split("/");
            students.add(new Student(details[0], details[1], Integer.parseInt(details[2])));
        }

        System.out.println("Enter the score to search:");
        int score = Integer.parseInt(scanner.nextLine());

        StudentUtility utility = new StudentUtility();
        utility.setStudentList(students);

        List<Student> filteredStudents = utility.filterStudentInfo(utility.convertToStream(), score);

        if (filteredStudents.isEmpty()) {
            System.out.println("No Student found");
        } else {
            System.out.println("Filtered student info whose score is above " + score + ":");
            filteredStudents.forEach(System.out::println);
        }
    }
}
