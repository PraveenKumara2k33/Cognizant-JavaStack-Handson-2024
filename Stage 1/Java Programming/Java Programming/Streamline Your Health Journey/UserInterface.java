import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String s = sc.nextLine();
        
        System.out.println("Enter your height in meters");
        float h = Float.parseFloat(sc.nextLine());
        
        System.out.println("Enter your weight in kilograms");
        int w = Integer.parseInt(sc.nextLine());

        float bmi= w/(h*h);
        System.out.println("Hello"+s+", Your BMI is "+String.format("%.2f",bmi));
        if (bmi<18.5) {
            System.out.println("You are under the category Under weight");
        } else if (bmi>=18.5 && bmi<25){
            System.out.println("You are under the category Normal weight");
        }
        else if(bmi>=25 && bmi<=30){
            System.out.println("You are under the category Over weight");
        }
        else if(bmi>30){
            System.out.println("You are under the category Obese");
        }
        sc.close();
    }
}
