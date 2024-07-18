import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of animals");
        int numberOfAnimals = Integer.parseInt(scanner.nextLine());

        List<Animal> animals = new ArrayList<>();
        System.out.println("Enter the animal details");

        for (int i = 0; i < numberOfAnimals; i++) {
            String[] details = scanner.nextLine().split(":");
            animals.add(new Animal(details[0], details[1], details[2]));
        }

        AnimalUtil animalUtil = new AnimalUtil();
        
        List<Animal> distinctAnimals = animalUtil.retriveDistinctAnimals(animals.stream());
        long distinctCount = animalUtil.countOfTotalDistinctAnimals(animals.stream());

        System.out.println("Distinct Animal Details");
        distinctAnimals.forEach(animal -> System.out.println(animal));
        System.out.println("Total Count of Distinct Animals : " + distinctCount);

        scanner.close();
    }
}
