Lego Builders
Description

Objective:

To work with abstract class.

Scenario:

A new construction company named Lego Builders. They aim to automate the generation of bills based on the Product Type. They have asked you to develop software to incorporate the feature to generate the bill amount as their software consultant.

# Requirements 1:  Calculation of bill amount

The application is to calculate the bill amount based on the product type.

# Component Specification: LegoBuilders Class (Parent Class)

# LegoBuilders Class

| Type (Class)   | Attributes                                     | Methods                                          | Responsibilities                                                                                         |
|----------------|------------------------------------------------|--------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| LegoBuilders   | - `String productId`<br>- `String productType` | - Getters and setters methods for all attributes.<br>- `LegoBuilders(String productId, String productType)`<br>- `public abstract double calculateTotalBill()` | - Include a public 2-argument constructor in the order: `productId`, `productType`.<br>- Implement the abstract method `public double calculateTotalBill()`. |


 

Note: The methods and the constructor should be public, and the attributes of the class should be protected. 

# Component Specification: ElectricalItemDetails Class (Needs to be a child class of the LegoBuilders class)

# ElectricalItemDetails Class

| Type (Class)          | Attribute       | Methods                                                                                                   | Responsibilities                                                                                                                                                            |
|-----------------------|-----------------|-----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ElectricalItemDetails | - `String productName`<br>- `int quantity`<br>- `double price` | - Getters and setters methods for all attributes.<br>- Public constructor: `ElectricalItemDetails(String productId, String productType, String productName, int quantity, double price)`<br>- `public double calculateTotalBill()` | - Include a public 5-argument constructor in the order: `productId`, `productType`, `productName`, `quantity`, and `price`.<br>- Calculate the product's bill amount using the `calculateTotalBill()` method. Return the amount if `productName` includes "wire" or "ElectricalPipe." If not, return 0. Formula: `bill = quantity * price;` Note: `productName` is case insensitive. |


Note: The methods and the constructor should be public, and the attributes of the class should be private.

# Component Specification: PlumbingItemDetails Class (Needs to be a child class of the LegoBuilders class)

# PlumbingItemDetails Class

| Type (Class)          | Attribute       | Methods                                                                                                   | Responsibilities                                                                                                                                                            |
|-----------------------|-----------------|-----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| PlumbingItemDetails   | - `String productName`<br>- `int quantity`<br>- `double price` | - Getters and setters methods for all attributes.<br>- Public constructor: `PlumbingItemDetails(String productId, String productType, String productName, int quantity, double price)`<br>- `public double calculateTotalBill()` | - Include a public 5-argument constructor in the order: `productId`, `productType`, `productName`, `quantity`, and `price`.<br>- Calculate the product's bill amount using the `calculateTotalBill()` method. Return the amount if `productName` includes "Tube" or "PlumbingPipe." If not, return 0. Formula: `bill = quantity * price;` Note: `productName` is case insensitive. |


Note: The methods and the constructor should be public, and the attributes of the class should be private.

Use a public class UserInterface with the main method to test the application. In the main method get the details as shown in the sample input.

Get the productId, productType, productName, quantity, and price from the user.

If the productType is other than `'ElectricalItem' or 'PlumbingItem'` , then the output should be `"<productType> is an invalid product type"` and terminate the program.

If the bill amount is '0', then the output should be "Product not available" and terminate the program. Else print the bill amount.

Note :

-         In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-         Ensure to follow the object-oriented specifications provided in the question description.

-         Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-         Adhere to the code template, if provided.

-         Please do not use System.exit(0) to terminate the program

 

# Sample Input/Output 1:

Enter the Product Id                                                            

123423                                                                         

Enter the Product Type                                                         

ElectricalItem                                                                 

Enter the Product Name                                                         

wire                                                                           

Enter the Quantity                                                             

7                                                                              

Enter the Price                                                                

80                                                                              

Bill Amount is 560.0    



# Sample Input/Output 2: 

Enter the Product Id                                                           

123456                                                                         

Enter the Product Type                                                         

PlumbingItem                                                                   

Enter the Product Name                                                         

tube                                                                            

Enter the Quantity                                                             

9                                                                              

Enter the Price                                                                 

60                                                                             

Bill Amount is 540.0         

                                                    

# Sample Input/Output 3: 

Enter the Product Id                                                            

234576                                                                         

Enter the Product Type                                                         

ConstructionItem                                                                

ConstructionItem is an invalid product type  

 

# Sample Input/Output 4:

Enter the Product Id                                                           

345678                                                                         

Enter the Product Type                                                          

ElectricalItem                                                                 

Enter the Product Name                                                         

Box                                                                             

Enter the Quantity                                                             

6                                                                              

Enter the Price                                                                

300                                                                            

Product not available   



# Sample Input/Output 5: 

Enter the Product Id                                                            

567894                                                                         

Enter the Product Type                                                         

PlumbingItem                                                                   

Enter the Product Name                                                         

Motor                                                                          

Enter the Quantity                                                             

8                                                                               

Enter the Price                                                                

600                                                                            

Product not available