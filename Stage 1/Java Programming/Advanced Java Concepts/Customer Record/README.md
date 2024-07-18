# Customer Record
## Description


### Objective:

To work with JDBC.

#### Scenario:

The ABC company wants to automate the process in their business. As a start-up, they need to automate their customer management system. Help them develop this application.  



# Component Specification: Customer (Model Class)    

# Customer Class

| Type (Class) | Attributes | Methods |
|--------------|------------|---------|
| Customer     | String id  | Getter and setter methods for all the attributes and a four-argument constructor are included in the code skeleton. |
|              | String name |         |
|              | String email |         |
|              | String phoneNo |       |


**Note: The class and methods should be declared public, and all the attributes should be declared private.**       

# Requirement 1: Add customer records to the database.

# Component Specification: CustomerManagementSystem   


| Component Name       | Type (Class)               | Methods                                                       | Responsibilities                                                                                                                                |
|----------------------|----------------------------|---------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| Add Customer details | `CustomerManagementSystem`   | `public int insertCustomerRecordsToDB(Customer customerObj)`    | This method should accept a customer object and add that customer's details to the database. If customer details are added successfully, return 1. Otherwise, return 0.  |
 

**Note:** The class and methods should be declared public, and all the attributes should be declared private.    

  

# Requirement 2: Validate customer Email.    

# Component Specification: Utility  


| Component Name          | Type (Class)    | Methods                                            | Responsibilities                                                                                        |
|-------------------------|-----------------|----------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| Validate Customer Email | `CustomerUtility` | `public boolean validateCustomerEmail(String customerEmail)` | This method should accept a customer email as a parameter and validate the email. The email should be in a proper format (e.g., john@abc.com). If the email is valid, return true; otherwise, return false. |


**Note:** The class and methods should be declared public, and all the attributes should be declared private.    



To connect to the database, you are provided with the `database.properties` file and the `DB.java file`.   The customer table has already been created at the back end. The structure of the **customer** table is:   

# Database Table Structure

| Column Name | Datatype               |
|-------------|------------------------|
| id          | VARCHAR (30) PRIMARY KEY |
| name        | VARCHAR (40)           |
| email       | VARCHAR (40)           |
| phoneNo     | VARCHAR (15)           |

  
The customer phoneNo should be a `10-digit number;` otherwise, customer records should not be added to the table.   

Create a class UserInterface that has the main method to perform the above operation.  
  

In the main method, the `insertCustomerRecordsToDB()` method is invoked, if the record is successfully added, print `"Customer record is added successfully"` otherwise, print `"Failed to add Customer record"`.  

 

**Note:**    

- Table name is case sensitive.
- Ensure to follow the object-oriented specifications provided in the question description.   

- Ensure to provide the names for classes, attributes, and methods as specified in the question description.   

- Adhere to the code template, if provided.   

- Please ignore the warning message that appears during compilation in the compilation window.  

- **Please do not use System.exit(0); to terminate the program.**  

 

  

# Sample input and output 1

Enter the customer id 

S11 

Enter the customer name 

Janu 

Enter the email 

janu@abc.com 

Enter the phoneNo 

7890123412 

Customer record is added successfully 

  

# Sample input and output 2

Enter the customer id 

Q13 

Enter the customer name 

Mary 

Enter the email 

mary12@abc.com 

Enter the phoneNo 

9012357891 

Customer record is added successfully 

  

# Sample input and output 3

Enter the customer id 

V18 

Enter the customer name 

Mary 

Enter the email 

mary12@abcom 

Enter the phoneNo 

9012357 

Failed to add the Customer record 