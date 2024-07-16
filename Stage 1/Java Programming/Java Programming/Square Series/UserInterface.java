import java.util.Scanner;

class SquareIncrementSequence {
    private int startNumber;

    public SquareIncrementSequence(int startNumber) {
        this.startNumber = startNumber;
    }

    public int[] generateSequence(int length) {
        int[] sequence = new int[length];
        int currentNumber = startNumber;

        for (int i = 0; i < length; i++) {
            int res = (currentNumber * currentNumber) + 1;
            sequence[i] = res;
            currentNumber++;
        }

        return sequence;
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int n = sc.nextInt();

        SquareIncrementSequence sequenceGenerator = new SquareIncrementSequence(n);
        int[] sequence = sequenceGenerator.generateSequence(10);

        System.out.println("Required Square Increment Sequence");
        for (int num : sequence) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
