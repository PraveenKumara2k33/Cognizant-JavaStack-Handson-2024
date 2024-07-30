import java.util.Scanner;

class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!(Character.isLowerCase(ch) || Character.isUpperCase(ch) || ch == ' ')) {
                return false;
            }
        }
        return true;
    }
}

class Encrypter {
    public static String getEncryptedName(String name) {
        Validator validator = new Validator();
        if (validator.validate(name)) {
            // Reverse the string and convert upper-case letters to lower-case
            StringBuilder reversedName = new StringBuilder(name).reverse();
            return reversedName.toString().toLowerCase();
        } else {
            throw new IllegalArgumentException("Try again with valid name");
        }
    }
}

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();
        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}