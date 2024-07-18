import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();

        FitFreakManagementSystem managementSystem = new FitFreakManagementSystem();
        List<FitFreak> fitFreakList = managementSystem.retrieveFitFreakListBasedOnAge(age);

        if (fitFreakList.isEmpty()) {
            System.out.println("No FitFreak records available for the given age");
        } else {
            for (FitFreak fitFreak : fitFreakList) {
                System.out.println(fitFreak);
            }
        }
    }
}
