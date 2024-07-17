// Concrete subclass for PrepaidPlan
class PrepaidPlan extends PhonePlan {
    private int validity;
    private double extraData;

    public PrepaidPlan(String providerName, String planName, String talkTime, int data, int smsPerDay, String planType, int validity, double extraData) {
        super(providerName, planName, talkTime, data, smsPerDay, planType);
        this.validity = validity;
        this.extraData = extraData;
    }

    public int getValidity() { 
        return validity; 
    }
    public void setValidity(int validity) { 
        this.validity = validity; 
    }
    public double getExtraData() { 
        return extraData; 
    }
    public void setExtraData(double extraData) { 
        this.extraData = extraData; 
    }

    @Override
    public double findPlanAmount() {
        double total = 0;
        String provider = providerName.toUpperCase();

        switch (provider) {
            case "AIRTEL":
                if (data == 2) {
                    if (validity == 28) total = 299;
                    else if (validity == 56) total = 549;
                    else if (validity == 84) total = 839;
                } else if (data == 3) {
                    if (validity == 28) total = 399;
                    else if (validity == 56) total = 649;
                    else if (validity == 84) total = 939;
                }
                break;

            case "JIO":
                if (data == 2) {
                    if (validity == 28) total = 389;
                    else if (validity == 56) total = 620;
                    else if (validity == 84) total = 939;
                } else if (data == 3) {
                    if (validity == 28) total = 400;
                    else if (validity == 56) total = 749;
                    else if (validity == 84) total = 839;
                }
                break;

            default:
                return -1;
        }

        return total;
    }
}
