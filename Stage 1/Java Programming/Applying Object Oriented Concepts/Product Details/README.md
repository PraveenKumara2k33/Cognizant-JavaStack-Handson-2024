# Product Details

## Description


### Objective:

To work with user defined exception.

#### Scenario:

Tesco is a 20$ shop in the U.S. that offers shoppers a variety of of products such as footwear, cosmetics, casual dresses, handbags, wallets, toys etc. The idea behind this big box store is to provide consumers with all the goods they require, under one roof with a product price ranging between $1 to $20.

You as a software consultant is being approached to automate the process of stock update with all products within the specified price range.

The stock keeper will enter the product details as a String, in the format `productCode:productType:productPrice`.

The system must update the stock for the products with price between $1 and $20, as this shop is a 20 shop and must be intimate " Stock updated" for valid productPrice. And for those products who's If the price is greater than $20 or less than $1, the system must alert the stock keeper that " Product price is invalid".

**Write a public class UserInterface with the method.**

`public static boolean validateProductPrice(int price) throws InvalidPriceException`

# Component Specification: UserInterface Class


| Component Name  | Type (Class)  | Methods                                         | Responsibilities                                                                                               |
|-----------------|---------------|-------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| To validate productPrice | UserInterface | `public static boolean validateProductPrice(int price)` | - This method checks whether the product price `price` is between $1 and $20.<br>- Returns `true` if the price is valid.<br>- Throws `InvalidPriceException` with the message "Product price is invalid" if the price is not within the valid range. |


**Note:** The class and methods should be declared as public.

**Assumption: productCode includes alphabets and digits, Only valid product code is entered.**

# Component Specification: InvalidPriceException Class (inherits Exception class)


| Type (Class)            | Responsibilities                                                                                     |
|-------------------------|-----------------------------------------------------------------------------------------------------|
| InvalidPriceException   | - Write a public parameterized constructor that takes a `String` as an argument.<br>- Set this `String` to the `message` attribute of the superclass `Exception`. |


**Note:** The class and methods should be declared as public.

In the `UserInterface` class write the main method. Get input from the user as shown in the sample input. From the input String, split the product details and pass the `productPrice` to the static method `validateProductPrice`. Based on the returned result `(true or exception)`, display the message as shown in sample output.

Use try catch block to handle the exception that is returned by the method `validateProductPrice`. In catch block display the message by using the `getMessage()` method.

**Note:** 

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

- Ensure to follow the object oriented specifications provided in the question.

- Ensure to provide the names for classes, attributes and methods as specified in the question.

- Adhere to the code template, if provided.

- Do not use System.exit(0) in the code.

  

# Sample Input and Output 1

Enter the number of product entries

2

Enter product 1 details

JS396:Cosmetics:15

Stock updated

Enter product 2 details

SJ429:Footwear:18

Stock updated

  

# Sample Input and Output 2

Enter the number of product entries

3

Enter product 1 details

KQ310:Shirt:39

Product price is invalid

Enter product 2 details

LH723:Pants:20

Stock updated

Enter product 3 details

AZ885:Shorts:16

Stock updated

 
# Sample Input and Output 3

Enter the number of product entries

1

Enter product 1 details

QS461:Socks:0

Product price is invalid
