package WordZee;

import java.util.*;

class WordZee {
    private String sentence;
    private String word;

    // Constructor to initialize the WordZee object with a sentence and a word
    public WordZee(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    // Method to validate the sentence
    public boolean isValidSentence() {
        // Check for any non-letter, non-space character
        for (char ch : sentence.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                return false;
            }
        }
        return true;
    }

    // Method to validate the word
    public boolean isValidWord() {
        // Check for any non-letter character
        for (char ch : word.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the word is in the sentence
    public boolean isWordInSentence() {
        return sentence.contains(word);
    }

    // Method to reverse the word in the sentence
    public String reverseWordInSentence() {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return sentence.replace(word, reversedWord);
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get sentence input
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

        WordZee wzee = new WordZee(sentence, " ");

        // Validate the sentence
        if (!wzee.isValidSentence()) {
            System.out.println(sentence + " is an invalid sentence");
            return;
        }

        // Get word input
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        WordZee wz = new WordZee(sentence, word);
        // Validate the word
        if (!wz.isValidWord()) {
            System.out.println(word + " is an invalid word");
            return;
        }

        // Check if the word is in the sentence
        if (!wz.isWordInSentence()) {
            System.out.println(word + " is not in the sentence");
            return;
        }

        // Reverse the word in the sentence and print the result
        String modifiedSentence = wz.reverseWordInSentence();
        System.out.println(modifiedSentence);
    }
}
