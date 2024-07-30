import java.util.ArrayList;
import java.util.List;

public class PasswordSanitizer {

    public static String filter(List<String> passwords) {
        List<String> filteredPasswords = new ArrayList<>();

        for (String password : passwords) {
            if (password.length() >= 5 && !isNumeric(password) && !isAlphabetic(password)) {
                filteredPasswords.add(password);
            }
        }

        return String.join(" ", filteredPasswords);
    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAlphabetic(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> passwords = List.of("p@c1", "pass@123", "word@321", "wordpass", "987345");
        String filteredPasswords = filter(passwords);

        System.out.println(filteredPasswords);
    }
}
