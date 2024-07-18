import java.util.Scanner;

public class UserInterface {

    // Method to create a lambda expression for WordSummarizer
    public static WordSummarizer calculateAsciiSum() {
        
        return (String word) -> {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += (int) c;
            }
            if (sum % 2 == 0) {
                return word + " is a perfect word";
            } else {
                return word + " is not a perfect word";
            }
        };
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word to find the sum:");
        String word = scanner.nextLine();

        // Validate the word (alphabets and spaces only)
        if (word.matches("[a-zA-Z ]+")) {
            // Get the WordSummarizer lambda
            WordSummarizer summarizer = calculateAsciiSum();
            // Summarize the word
            String result = summarizer.summarize(word);
            // Display the result
            System.out.println(result);
        } else {
            System.out.println(word + " is an invalid word");
        }

        scanner.close();
    }
}
