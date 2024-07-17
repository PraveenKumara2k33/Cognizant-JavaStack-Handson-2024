import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for component details
        System.out.println("Enter the component name");
        String name = scanner.nextLine();

        System.out.println("Enter the component weight on earth");
        double weight = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        if (weight < 1) {
            System.out.printf("%.1f Newton is an invalid weight%n", weight);
            return;
        }

        System.out.println("Enter the material used");
        String material = scanner.nextLine();

        System.out.println("Enter the cost of Production");
        double costOfProduction = scanner.nextDouble();

        // Create RocketComponent object
        RocketComponent component = new RocketComponent(name, weight, material, costOfProduction);

        // Calculate mass
        double mass = component.calculateMassOfRocketComponent(weight);
        if (mass == -1) {
            System.out.printf("%.1f Newton is an invalid weight%n", weight);
            return;
        }

        // Display component details
        System.out.println("Rocket Component");
        System.out.println("Name : " + component.getName());
        System.out.println("Weight : " + component.getWeight() + " Newton");
        System.out.println("Acceleration Due To Gravity : " + component.getAccelerationDueToGravity() + " meters per second square");
        System.out.println("Mass : " + mass + " kg");
        System.out.println("Material Used : " + component.getMaterial());
        System.out.println("Cost Of Production : Rs. " + component.getCostOfProduction());
    }
}
