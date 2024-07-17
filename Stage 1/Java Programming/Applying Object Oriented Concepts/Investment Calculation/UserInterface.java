import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of company shares you bought");
        int nocompany = scanner.nextInt();

        System.out.println("Enter total number of shares");
        int totalShares = scanner.nextInt();
        Investment.setNoOfShares(totalShares);
       

            System.out.println("Enter the company id");
            int companyId = scanner.nextInt();

            System.out.println("Enter the company name");
            String companyName = scanner.nextLine();

            System.out.println("Enter the number of shares you bought");
            int sharesBought = scanner.nextInt();

            System.out.println("Enter the value of one share");
            double oneshare = scanner.nextDouble();
            
            Investment investment = new Investment();
            
            investment.setCompanyId(companyId);
            investment.setCompanyName(companyName);
            investment.setValueOfOneShare(oneshare);

            double totalInvestment = investment.calculateTotalAmountOfInvestment(sharesBought);
            if (totalInvestment != -1) {
                System.out.println("Total number of shares=" + totalShares);
                System.out.println("Total amount of investment=" + totalInvestment);
                System.out.println("Remaining Available shares=" + Investment.getNoOfShares());
            }
            int total=Investment.getNoOfShares();
            System.out.println("Enter the company id");
            companyId=scanner.nextInt();
            System.out.println("Enter the number of shares you bought");
            int sharesBought1=scanner.nextInt();
            System.out.println("Enter the number of one share");
            oneshare=scanner.nextDouble();

            investment.setCompanyId(companyId);
            investment.setCompanyName(companyName);
            investment.setValueOfOneShare(oneshare);
 

            if (totalInvestment != -1) {
                System.out.println("Total number of shares=" + total);
                System.out.println("Total amount of investment=" + totalInvestment);
                System.out.println("Remaining Available shares=" + Investment.getNoOfShares());
            }

        scanner.close();
    }
}
