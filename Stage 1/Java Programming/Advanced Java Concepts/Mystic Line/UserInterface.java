import java.util.Scanner;

public class UserInterface {

    public static Calculate calculateSlope() {
        return (x1, x2, y1, y2) -> {
            if (x2 - x1 == 0) {
                return "Slope is undefined (vertical line)";
            }
            double slope = (double)(y2 - y1) / (x2 - x1);
            return "Slope of the line is " + (int)slope;
        };
    }

    public static Calculate calculateMidpoint() {
        return (x1, x2, y1, y2) -> {
            int midX = (x1 + x2) / 2;
            int midY = (y1 + y2) / 2;
            return "Mid point of the line is (" + midX + "," + midY + ")";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values for x intercepts and y intercepts");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Calculate slopeCalc = calculateSlope();
        Calculate midpointCalc = calculateMidpoint();

        String slopeResult = slopeCalc.performCalculation(x1, x2, y1, y2);
        String midpointResult = midpointCalc.performCalculation(x1, x2, y1, y2);

        System.out.println(slopeResult);
        System.out.println(midpointResult);

        scanner.close();
    }
}
