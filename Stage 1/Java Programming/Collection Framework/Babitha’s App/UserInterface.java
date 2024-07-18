import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


class ParagraphAnalyzer{
   
    private String paragraph;
    private Map<String, Integer> wordCountMap;

public ParagraphAnalyzer(String paragraph) {
    this.paragraph = paragraph;
    this.wordCountMap= new TreeMap<>();
}

public void analyzeParagraph() {
    // Convert paragraph to lowercase
    String normalizedParagraph = paragraph.toLowerCase();

    // Define the special characters to split on
    String[] wordsArray = normalizedParagraph.split("[,;:.?!@#$%\\s]+");

    for (String word : wordsArray) {
        if (!word.isEmpty()) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        } 
    }
}

public void displayResult() {

    int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
    System.out.println("Total number of words " + totalWords);
    System.out.println("Words with the count");

    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
}

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph typed");
        String inputParagraph = scanner.nextLine();

        ParagraphAnalyzer analyzer = new ParagraphAnalyzer(inputParagraph);
        analyzer.analyzeParagraph();

        scanner.close();
    }
}

