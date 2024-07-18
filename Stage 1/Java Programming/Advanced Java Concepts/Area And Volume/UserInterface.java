import java.util.Scanner;


// UserInterface class
public class UserInterface {

    public static Calculation areaOfSquare() {
        return (int a) -> {
            if (a <= 0) {
                System.out.println(a + " is an invalid value");
                return -1;
            }
            return a*a;
        };
    }

    public static Calculation areaOfCircle() {
        return (int a) -> {
            if (a <= 0) {
                System.out.println(a + " is an invalid value");
                return -1;
            }
            // Use integer division to match expected output
            return (a*a*22)/7;
        };
    }

    public static Calculation volumeOfCube() {
        return (int a) -> {
            if (a <= 0) {
                System.out.println(a + " is an invalid value");
                return -1;
            }
            return a*a*a;
        };
    }

    public static Calculation volumeOfSphere() {

        float c=4/3;
        float d=22/7l
        float m=c*d;
        return (int a) -> {
            if (a <= 0) {
                System.out.println(a + " is an invalid value");
                return -1;
            }
            // Adjust the formula to match expected simplified float result
            return (float)(m*a*a*a);
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = scanner.nextInt();

        // Validate the input value
        if (a <= 0) {
            System.out.println(a + " is an invalid value");
            return;
        }

        // Area of Square
        Calculation areaSquare = areaOfSquare();
        float resultSquare = areaSquare.areaAndVolumeCalculation(a);
        if (resultSquare != -1) {
            System.out.println("Area of the Square = " + resultSquare);
        }

        // Area of Circle
        Calculation areaCircle = areaOfCircle();
        float resultCircle = areaCircle.areaAndVolumeCalculation(a);
        if (resultCircle != -1) {
            System.out.println("Area of the Circle = " + resultCircle);
        }

        // Volume of Cube
        Calculation volumeCube = volumeOfCube();
        float resultCube = volumeCube.areaAndVolumeCalculation(a);
        if (resultCube != -1) {
            System.out.println("Volume of the Cube = " + resultCube);
        }

        // Volume of Sphere
        Calculation volumeSphere = volumeOfSphere();
        float resultSphere = volumeSphere.areaAndVolumeCalculation(a);
        if (resultSphere != -1) {
            System.out.println("Volume of the Sphere = " + resultSphere);
        }

        scanner.close();
    }
}
