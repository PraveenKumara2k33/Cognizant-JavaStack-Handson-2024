// Concrete subclass for PostpaidPlan
class PostpaidPlan extends PhonePlan {
    private String dataCarryOver;
    private String subscription;

    public PostpaidPlan(String providerName, String planName, String talkTime, int data, int smsPerDay, String planType, String dataCarryOver) {
        super(providerName, planName, talkTime, data, smsPerDay, planType);
        this.dataCarryOver = dataCarryOver;
    }

    public String getDataCarryOver() { 
        return dataCarryOver; 
    }
    public void setDataCarryOver(String dataCarryOver) { 
        this.dataCarryOver = dataCarryOver; 
    }
    public String getSubscription() { 
        return subscription; 
    }
    public void setSubscription(String subscription) { 
        this.subscription = subscription; 
    }

    @Override
    public double findPlanAmount() {
        double total = 0;
        String provider = providerName.toUpperCase();
        String plan = planName.toUpperCase();

        switch (provider) {
            case "AIRTEL":
                switch (plan) {
                    case "REGULAR-POSTPAY":
                        subscription = "Wynk Music";
                        total = 399;
                        break;
                    case "FAMILY PLAN FOR 2":
                        subscription = "Wynk Music,Prime";
                        total = 599;
                        break;
                    case "FAMILY PLAN FOR 5":
                        subscription = "Wynk Music,Prime,Extra 5GB data";
                        total = 999;
                        break;
                    case "FAMILY PLAN FOR 8":
                        subscription = "Wynk Music,Prime,Netflix,Extra 10GB data";
                        total = 1599;
                        break;
                    default:
                        return -1;
                }
                break;

            case "JIO":
                switch (plan) {
                    case "REGULAR-POSTPAY":
                        subscription = "Jio Saavn";
                        total = 500;
                        break;
                    case "FAMILY PLAN FOR 2":
                        subscription = "Jio Saavn,Amazon Prime,Extra 3GB data";
                        total = 720;
                        break;
                    case "FAMILY PLAN FOR 5":
                        subscription = "Jio Saavn,Amazon Prime,Jio Apps,Extra 5GB data";
                        total = 980;
                        break;
                    case "FAMILY PLAN FOR 8":
                        subscription = "Jio Saavn,Amazon Prime,Netflix,Jio Apps,Extra 10GB data";
                        total = 1650;
                        break;
                    default:
                        return -1;
                }
                break;

            default:
                return -1;
        }

        return total;
    }
}
