import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter user name:");
        String userName = scanner.nextLine();

        System.out.print("Enter weight in kg:");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter number of steps taken:");
        int stepsTaken = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter distance covered in km:");
        double distanceCovered = Double.parseDouble(scanner.nextLine());

        System.out.print("Is the user running? (true/false):");
        boolean runningStatus = scanner.nextBoolean();


        // Create UserFitnessData object
        UserFitnessData userData = new UserFitnessData(userName, weight, stepsTaken, distanceCovered, runningStatus);

        // Output results
        System.out.println("User Name: " + userData.getUserName());
        System.out.printf("Weight: %.1f kg\n", userData.getWeight());
        System.out.println("Steps Taken: " + userData.getStepsTaken());
        System.out.printf("Distance Covered: %.1f km\n", userData.getDistanceCovered());
        System.out.println("Running: " + userData.getRunningStatus());
        System.out.println("Fitness Level: " + userData.findFitnessLevel());

        // Calculate and display calories burnt
        double caloriesBurnt = FitnessMonitor.calculateCaloriesBurnt(userData.getWeight(), userData.getDistanceCovered(), userData.getRunningStatus());
        System.out.printf("Calories Burnt: %.2f\n", caloriesBurnt);
    }
}
