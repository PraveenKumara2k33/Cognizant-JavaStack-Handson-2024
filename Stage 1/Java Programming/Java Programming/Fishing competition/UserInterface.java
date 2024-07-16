import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details");
        String input = scanner.nextLine();
        
        String[] details = input.split(":");
        
        if (details.length != 5) {
            System.out.println("Invalid input format");
            return;
        }
        
        String name = details[0];
        int age = Integer.parseInt(details[1]);
        int bigFishCount = Integer.parseInt(details[2]);
        int mediumFishCount = Integer.parseInt(details[3]);
        int smallFishCount = Integer.parseInt(details[4]);
        
        if (age < 18) {
            System.out.println(age + " is an invalid age");
            return;
        }
        
        if (bigFishCount < 0) {
            System.out.println(bigFishCount+" is an invalid input");
            return;
        }
        
        if (mediumFishCount < 0) {
            System.out.println(mediumFishCount+" is an invalid input");
            return;
        }
        
        if (smallFishCount < 0) {
            System.out.println(smallFishCount+" is an invalid input");
            return;
        }
        
        int points = (bigFishCount * 10) + (mediumFishCount * 6) + (smallFishCount * 3);
        
        System.out.println(name + " scored " + points + " points");
    }
}
