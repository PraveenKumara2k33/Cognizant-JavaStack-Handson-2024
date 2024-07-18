import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

            // Prompt user for input character
            System.out.println("Enter the starting character");
            String inputChar = inputReader.readLine().trim();

            char startingChar;
            if (inputChar.length() == 1 && Character.isUpperCase(inputChar.charAt(0))) {
                startingChar = inputChar.charAt(0);
            } else {
                System.out.println("Invalid input character");
                return;
            }

            String line;
            int count = 0;
            List<String> namesToCopy = new ArrayList<>();

            // Read file1.txt line by line
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 0) {
                    String name = parts[0];
                    if (name.length() > 0 && Character.toUpperCase(name.charAt(0)) == startingChar) {
                        namesToCopy.add(line);
                        count++;
                    }
                }
            }

            reader.close();

            // Write filtered names to file2.txt
            for (String name : namesToCopy) {
                writer.write(name);
                writer.newLine();
            }

            writer.close();

            // Display output based on the count
            if (count > 0) {
                System.out.println(count + " names are added to the file2");
            } else {
                System.out.println("No names found");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } 
    }
}
