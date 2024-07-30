import java.util.ArrayList;
import java.util.List;


public class PasswordSanitizer_2 {
    public String filter(List<String> passwords) {
        List<String> validPasswords = new ArrayList<>();
        for (String password : passwords) {
            if (isValid(password)) {
                validPasswords.add(password);
            }
        }
        return String.join(" ", validPasswords);
    }

    private boolean isValid(String password) {
        if (password.length() < 5) {
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }

    public static void main(String[] args) {
        PasswordSanitizer_2 sanitizer = new PasswordSanitizer_2();
        List<String> passwords = List.of("p@cl", "pass@123", "word@321", "wordpass", "987345");
        String filteredPasswords = sanitizer.filter(passwords);
        System.out.println(filteredPasswords);  // Output: pass@123 word@321
    }
}