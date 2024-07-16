import java.util.Scanner;

class WaterTank {
    private double radius;
    private double height;
    private static final double PI = 3.14;

    public WaterTank(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public boolean isValid() {
        return radius > 0 && height > 0;
    }

    public double getTotalCapacity() {
        return PI * radius * radius * height;
    }

    public double getAlarmCapacity() {
        return 0.75 * getTotalCapacity();
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius");
        double radius = scanner.nextInt();

        System.out.println("Enter the height");
        double height = scanner.nextInt();

        WaterTank waterTank = new WaterTank(radius, height);

        if (!waterTank.isValid()) {
            System.out.println("Invalid measurement");
        } else {
            double totalCapacity = waterTank.getTotalCapacity();
            double alarmCapacity = waterTank.getAlarmCapacity();

            System.out.printf("Total capacity is %.2f litres%n", totalCapacity);
            System.out.printf("Capacity for alarm is %.2f litres%n", alarmCapacity);
        }

        scanner.close();
    }
}
