# Brilliant Restaurant
## Description

### Objective:

To work with classes and objects

#### Scenario:

Brilliant Restaurant is a newly started restaurant. They provide home delivery to customers and planned to automate the bill generation process, based on the type of order. You, being their software consultant, have been approached to develop software to implement the functionality to generate the bill.

# Component Specification: Restaurant


| Type (Class)  | Attributes          | Methods                                                                 |
|---------------|---------------------|-------------------------------------------------------------------------|
| Restaurant    | - `customerName`: String<br>- `orderNumber`: int<br>- `deliveryType`: String<br>- `foodName`: String<br>- `phoneNumber`: long | - Constructor: `Restaurant(customerName, orderNumber, deliveryType, foodName, phoneNumber)`<br>  Initializes the Restaurant object with given values.<br>- Getters and setters for all attributes.<br>Allows accessing and modifying attribute values. |



**Requirement:** Calculate the bill based on the deliveryType.

# Component Specification:  Restaurant


| Component Name | Type (Class) | Methods                | Responsibilities                                              |
|----------------|--------------|------------------------|------------------------------------------------|
|Calculate the total bill| Restaurant     | `public double calculateTotalBill(double cost)` | Calculates the total bill based on the deliveryType and returns the calculated bill amount. |


**Note:** The class and methods should be declared as public and all the attributes should be declared as private.

**Formula to calculate the bill amount in the Restaurant class:**

`Bill amount = ( Cost * Tax ) + Cost`


| deliveryType   | Tax  |
|----------------|------|
| HomeDelivery   | 0.8  |
| Parcel         | 0.5  |
| NormalOrder    | 0.3  |


**Note:** The deliveryType is case sensitive.

**Example:**

`Bill amount= [Cost (of a ChickenBurger) * Tax (deliveryType is of NormalOrder) ] + Cost (of a ChickenBurger) `

`Bill amount = (18 * 0.3 ) + 18 = 23.4`

 

In the UserInterface class, write the main method.

Get the values from the user.

When the deliveryType is not any of the specified type ( i.e , HomeDelivery, Parcel, NormalOrder) , then print "Invalid Order Type " and terminate the program.

Display the result as shown in the sample output.

 

**Note:**

-        In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-        Ensure to follow the object-oriented specifications provided in the question description.

-        Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-        Adhere to the code template, if provided.

-        Please do not use System.exit(0) to terminate the program

 

# Sample Input 1:

Enter the Name

Alfred

Enter the Order Number

3343

Enter the Delivery Type

NormalOrder

Enter the Food Name

ChickenBurger

Enter the Phone Number

8899889977

Enter the price of the item

18



# Sample Output 1:

Name Alfred

Order Number 3343

Delivery Type NormalOrder

Food Name ChickenBurger

Phone Number 8899889977

Bill Amount 23.4

 

# Sample Input 2:

Enter the Name

James

Enter the Order Number

43433

Enter the Delivery Type

OnlineOrder



# Sample Output 2:

Invalid Order Type
