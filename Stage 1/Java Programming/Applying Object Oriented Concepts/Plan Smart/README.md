Plan Smart

Description

Objective:

To work with abstract class.

Scenario:

In today's fast-paced world, communication plays a vital role in everyone's life. People rely heavily on phone plans to stay connected with their loved ones and the world. With numerous phone plans available on the market, it becomes quite a task to choose the right one that fits an individual's needs and budget. Prepaid and postpaid phone plans are two popular types of plans that cater to the different needs of customers.

The manager aimed to determine the plan amount based on the type of phone plan chosen by the customer and display the plan details with the plan amount.

As a software consultant, your task is to aid the manager in the process by creating Java code that meets the specified criteria. 


# Component Specification: PhonePlan (Parent class) 

# PhonePlan Class

| Type (Class)  | Attributes                                       | Methods                                                                                                       | Responsibilities                                                                                                                                                                        |
|---------------|--------------------------------------------------|---------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| PhonePlan     | - `String providerName`<br>- `String planName`<br>- `String talkTime`<br>- `int data`<br>- `int smsPerDay`<br>- `String planType` | - Getters and setters methods for all attributes.<br>- Public constructor: `PhonePlan(String providerName, String planName, String talkTime, int data, int smsPerDay, String planType)`<br>- `abstract public double findPlanAmount()` | - Include a six-argument constructor in the order: `providerName`, `planName`, `talkTime`, `data`, `smsPerDay`, and `planType`.<br>- Implement the abstract method `abstract public double findPlanAmount()`. |


Note: The class should be abstract, the methods and the constructor should be public, whereas the findPlanAmount method should be abstract and public, and the attributes of the class should be protected. 

 

Create concrete subclasses named `PrepaidPlan` and `PostpaidPlan` that inherit the `PhonePlan class`. The `findPlanAmount` method in the `PrepaidPlan class` and `PostpaidPlan class` must have an implementation, and it should find the plan amount based on the planType. 



# Component Specification: PrepaidPlan (Child class) 

# PrepaidPlan Class

| Type (Class)  | Attributes                                                                                             | Methods                                                                                                       | Responsibilities                                                                                                                                                                            |
|---------------|--------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| PrepaidPlan   | - `int validity`<br>- `double extraData`                                                               | - Getters and setters methods for all attributes.<br>- Public constructor: `PrepaidPlan(String providerName, String planName, String talkTime, int data, int smsPerDay, String planType, int validity, double extraData)`<br>- `public double findPlanAmount()` | - Include a public eight-argument constructor in the order: `providerName`, `planName`, `talkTime`, `data`, `smsPerDay`, `planType`, `validity`, and `extraData`.<br>- Implement the method `public double findPlanAmount()`. This method should find the plan amount for the `planType` based on the `providerName`, `data`, and `validity`, and return the plan amount. If the `providerName` (or) `data` (or) `validity` is invalid, return -1. Condition: `providerName` is case insensitive. |


Note: The methods and the constructor should be public, and the attributes of the class should be private.

According to the `providerName, data, validity, and cost` are mentioned.


# Provider Plans

| Provider Name | Data  | Validity (in days) | Cost |
|---------------|-------|--------------------|------|
| AIRTEL        | 2GB   | 28                 | 299  |
|               |       | 56                 | 549  |
|               |       | 84                 | 839  |
|               | 3GB   | 28                 | 399  |
|               |       | 56                 | 649  |
|               |       | 84                 | 939  |
| JIO           | 2GB   | 28                 | 389  |
|               |       | 56                 | 620  |
|               |       | 84                 | 939  |
|               | 3GB   | 28                 | 400  |
|               |       | 56                 | 749  |
|               |       | 84                 | 839  |
 

# Component Specification: PostpaidPlan (Child class) 

# PostpaidPlan Class

| Type (Class)  | Attributes                                                                                                 | Methods                                                                                                       | Responsibilities                                                                                                                                                                            |
|---------------|------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| PostpaidPlan  | - `String dataCarryOver`<br>- `String subscription`                                                        | - Getters and setters methods for all attributes.<br>- Public constructor: `PostpaidPlan(String providerName, String planName, String talkTime, int data, int smsPerDay, String planType, String dataCarryOver)`<br>- `public double findPlanAmount()` | - Include a public seven-argument constructor in the order: `providerName`, `planName`, `talkTime`, `data`, `smsPerDay`, `planType`, and `dataCarryOver`.<br>- Implement the method `public double findPlanAmount()`. This method should find the plan amount for the `planType` based on the `providerName`, `planName` and set the `subscription` based on the `planName` and return the plan amount. If the `providerName` (or) `planName` is invalid, return -1. Condition: `providerName`, `planName` are case insensitive. |


Note: The methods and the constructor should be public, and the attributes of the class should be private.

According to the `providerName and the planName` , the subscription and the cost are mentioned.



| Provider Name | Plan Name            | Subscription                                    | Cost |
|---------------|----------------------|-------------------------------------------------|------|
| AIRTEL        | Regular-PostPay      | Wynk Music                                      | 399  |
|               | Family Plan For 2    | Wynk Music, Prime                               | 599  |
|               | Family Plan For 5    | Wynk Music, Prime, Extra 5GB data               | 999  |
|               | Family Plan For 8    | Wynk Music, Prime, Netflix, Extra 10GB data     | 1599 |
| JIO           | Regular-PostPay      | Jio Saavn                                       | 500  |
|               | Family Plan For 2    | Jio Saavn, Amazon Prime, Extra 3GB data         | 720  |
|               | Family Plan For 5    | Jio Saavn, Amazon Prime, Jio Apps, Extra 5GB data| 980  |
|               | Family Plan For 8    | Jio Saavn, Amazon Prime, Netflix, Jio Apps, Extra 10GB data | 1650 |


Use a `public class UserInterface` with the main method to test the application. Check for the plan type in the main method, if the `planType` is valid, display the plan details; otherwise, display `"Please provide a valid plan details"`. 

- If the PhonePlan is a type of PrepaidPlan, then invoke the findPlanAmount method of that class, and if the PhonePlan is a type of PostpaidPlan, then invoke the findPlanAmount  method of that class and display the return plan amount as mentioned in the sample output. 

- If the `findPlanAmount` in the PrepaidPlan class returns -1, then print the output as `"Invalid prepaid plan Details"`.

- If the `findPlanAmount` in the PostpaidPlan class returns -1, then print the output as `"Invalid postpaid plan Details"`.



Note:

- In the sample input and output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
- Ensure to follow the object-oriented specifications provided in the question.
- Ensure to provide the names for classes, attributes, and methods as specified in the question.
- Adhere to the code template, if provided.
- To get two decimal places, refer to the print statement mentioned below:

# Sample Input / Output 1:

Enter the network provider name:

AIRTEL

Enter the plan name:

Truely Unlimited

Enter the talk time plan:

Unlimited local calls,STD

Enter the data plan(in GB):

3

Enter the SMS plan(per/day):

180

Enter the plan type:

prepaidPlan

Enter the validity(in days):

84

Enter the extra data provided(in GB):

5

Provider Name - AIRTEL

Plan Name - Truely Unlimited

Talk Time - Unlimited local calls,STD

Data for the plan (per day) - 3 GB

SMS for the plan - 180 SMS per day

Plan type - prepaidPlan

Validity for the plan - 84 days

Extra data for the plan - 5.0 GB

Plan Amount to be paid for Truely Unlimited plan is Rs 939.0



# Sample Input / Output 2:

Enter the network provider name:

JIO

Enter the plan name:

Family Plan For 8

Enter the talk time plan:

1.2/min

Enter the data plan(in GB):

250

Enter the SMS plan(per/day):

180

Enter the plan type:

postpaidplan

Do you want to roll over unused data

yes

Provider Name - JIO

Plan Name - Family Plan For 8

Talk Time - 1.2/min

Data for the plan (per day) - 250 GB

SMS for the plan - 180 SMS per day

Plan type - postpaidplan

want to roll over unused data - yes

Subscription for the plan - Jio Saavn,Amazon Prime,Netflix,Jio Apps,Extra 10GB data

Plan Amount to be paid for Family Plan For 8 plan is Rs 1650.0



# Sample Input and Output 3:

Enter the network provider name:

IDEA

Enter the plan name:

Family Plan For 8

Enter the talk time plan:

1.2/min

Enter the data plan(in GB):

300

Enter the SMS plan(per/day):

280

Enter the plan type:

postpaidplan

Do you want to roll over unused data

No


Invalid postpaid plan Details

`[Explanation:  IDEA is an invalid network provider.]`