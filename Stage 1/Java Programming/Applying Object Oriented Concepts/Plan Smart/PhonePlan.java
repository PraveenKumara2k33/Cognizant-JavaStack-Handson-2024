abstract public class PhonePlan {
    protected String providerName;
    protected String planName;
    protected String talkTime;
    protected int data;
    protected int smsPerDay;
    protected String planType;

    public PhonePlan(String providerName, String planName, String talkTime, int data, int smsPerDay, String planType) {
        this.providerName = providerName;
        this.planName = planName;
        this.talkTime = talkTime;
        this.data = data;
        this.smsPerDay = smsPerDay;
        this.planType = planType;
    }

    public String getProviderName() { 
        return providerName; 
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName; 
    }
    public String getPlanName() { 
        return planName; 
    }
    public void setPlanName(String planName) { 
        this.planName = planName; 
    }
    public String getTalkTime() { 
        return talkTime; 
    }
    public void setTalkTime(String talkTime) { 
        this.talkTime = talkTime; 
    }
    public int getData() { 
        return data; 
    }
    public void setData(int data) { 
        this.data = data; 
    }
    public int getSmsPerDay() { 
        return smsPerDay; 
    }
    public void setSmsPerDay(int smsPerDay) { 
        this.smsPerDay = smsPerDay; 
    }
    public String getPlanType() { 
        return planType; 
    }
    public void setPlanType(String planType) { 
        this.planType = planType; 
    }

    abstract public double findPlanAmount();
}