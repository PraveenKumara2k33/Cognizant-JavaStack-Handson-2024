import java.util.Scanner;

class UserInterface {

    public static String sumOfArrays(String data) {
        String[] parts = data.split(":");
        if (parts.length < 1) {
            return "Provide a valid Integer";
        }

        try {
            int arraySize = Integer.parseInt(parts[0]);

            if (arraySize < 0) {
                throw new NegativeArraySizeException("Provide a positive Integer to allocate memory for the array");
            }

            int[] array = new int[arraySize];
            int sum = 0;

            if (parts.length - 1 != arraySize) {
                throw new ArrayIndexOutOfBoundsException("Error: Array index is out of range");
            }

            for (int i = 1; i <= arraySize; i++) {
                array[i - 1] = Integer.parseInt(parts[i]);
                sum += array[i - 1];
            }

            return "Sum of the array elements is " + sum;

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Provide a valid Integer");
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the data");
        String data = scanner.nextLine();

        try {
            String result = sumOfArrays(data);
            System.out.println(result);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
