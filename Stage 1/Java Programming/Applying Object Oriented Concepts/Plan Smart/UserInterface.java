// Main class to test the application
public class UserInterface {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Input details
        System.out.println("Enter the network provider name:");
        String providerName = scanner.nextLine();
        
        System.out.println("Enter the plan name:");
        String planName = scanner.nextLine();
        
        System.out.println("Enter the talk time plan:");
        String talkTime = scanner.nextLine();
        
        System.out.println("Enter the data plan (in GB):");
        int data = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the SMS plan (per/day):");
        int smsPerDay = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the plan type:");
        String planType = scanner.nextLine().toLowerCase();

        if (planType.equals("prepaidplan")) {
            System.out.println("Enter the validity (in days):");
            int validity = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Enter the extra data provided (in GB):");
            double extraData = Double.parseDouble(scanner.nextLine());

            PrepaidPlan prepaidPlan = new PrepaidPlan(providerName, planName, talkTime, data, smsPerDay, planType, validity, extraData);
            double amount = prepaidPlan.findPlanAmount();

            if (amount != -1) {
            System.out.println("Provider Name - " + prepaidPlan.getProviderName());
            System.out.println("Plan Name - " + prepaidPlan.getPlanName());
            System.out.println("Talk Time - " + prepaidPlan.getTalkTime());
            System.out.println("Data for the plan (per day) - " + prepaidPlan.getData() + " GB");
            System.out.println("SMS for the plan - " + prepaidPlan.getSmsPerDay() + " SMS per day");
            System.out.println("Plan type - " + prepaidPlan.getPlanType());
            System.out.println("Validity for the plan - " + prepaidPlan.getValidity() + " days");
            System.out.println("Extra data for the plan - " + prepaidPlan.getExtraData() + " GB");
            System.out.printf("Plan Amount to be paid for %s plan is Rs %.1f\n", prepaidPlan.getPlanName(), amount);                
            } else {
                System.out.println("Invalid prepaid plan Details");
            }
        } else if (planType.equals("postpaidplan")) {
            System.out.println("Do you want to roll over unused data:");
            String dataCarryOver = scanner.nextLine();

            PostpaidPlan postpaidPlan = new PostpaidPlan(providerName, planName, talkTime, data, smsPerDay, planType, dataCarryOver);
            double amount = postpaidPlan.findPlanAmount();

            if (amount != -1) {
            System.out.println("Provider Name - " + postpaidPlan.getProviderName());
            System.out.println("Plan Name - " + postpaidPlan.getPlanName());
            System.out.println("Talk Time - " + postpaidPlan.getTalkTime());
            System.out.println("Data for the plan (per day) - " + postpaidPlan.getData() + " GB");
            System.out.println("SMS for the plan - " + postpaidPlan.getSmsPerDay() + " SMS per day");
            System.out.println("Plan type - " + postpaidPlan.getPlanType());
            System.out.println("Want to roll over unused data - " + postpaidPlan.getDataCarryOver());
            System.out.printf("Subscription for the plan - %s\n", postpaidPlan.getSubscription());
            System.out.printf("Plan Amount to be paid for %s plan is Rs %.1f\n", postpaidPlan.getPlanName(), amount);
            } else {
                System.out.println("Invalid postpaid plan Details");
            }
        } else {
            System.out.println("Please provide a valid plan details");
        }

        scanner.close();
    }
}
