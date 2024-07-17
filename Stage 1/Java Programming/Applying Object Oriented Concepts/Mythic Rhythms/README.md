# Mythic Rhythms


## Description

### Objective:


To work with abstract class.

#### Scenario:

As an entrepreneur, you've always wanted to follow your ambition of opening a musical instrument business. In today's e-commerce-dominated world, you want to create an e-commerce application for your beloved. At the start of your firm, you plan to sell just string instruments, especially guitars.

So, you approach a software developer to help you with the required assistance.

You are provided with a `public-class Customer` with the following private attributes:

        int  customerId

        String customerName

        long mobileNumber

Appropriate public getter and setter methods are given as a code skeleton.

Write an `abstract public class MusicalInstrument` with the following protected attributes:

        int instrumentId

	String instrumentName

	String instrumentType

	double price

	Customer customerObj

Uncomment the public getters and setters provided in the template.

Write a public five-argument constructor with arguments - instrumentId, instrumentName, instrumentType, price and customerObj.

Make `public double calculateTotalBill()` method as `abstract in MusicalInstrument class`.

Write a `public class StringInstrument` with the following private attribute: 

        int numberOfStrings

        String stringMaterial


Uncomment the public getters and setters provided in the template.

Make `StringInstrument` class to inherit the MusicalInstrument class.

Write a public seven argument constructor with arguments - instrumentId, instrumentName, instrumentType, price, customerObj, numberOfStrings, and stringMaterial.


Implement the abstract method as follows,

`public double calculateTotalBill()` -- This method should return the calculated total bill value if `stringMaterial (case-insensitive)` is one of the values listed below; otherwise, return -1.


stringMaterial `"Nylon"`, price per string is 15.
stringMaterial `"Steel"`, price per string is 20.

# The total bill is calculated as follows:

`Total Bill = price + (price per string* numberOfStrings)`

In this method, also check if the price is greater than 20000, perform a 30% discount. Subtract the discount from the total Bill, set the price with total bill after discount, and return the value. Otherwise, no discounts will be provided.


the value after discount is calculated as follows:

`Value after discount= totalBill - (totalBill * 0.30) `  

Create a public class UserInterface which has the main method.  Check the correctness of the methods written in these classes.

**Note:**

`All class, methods need to be declared as public.`

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 
- Ensure to follow the object-oriented specifications provided in the question description. 
- Ensure to provide the names for classes, attributes, and methods as specified in the question description. 
- Adhere to the code template, if provided 
- Please do not use System.exit(0); to terminate the program.


# Sample Input / Output 1

Enter the Customer Details

2468:John:9988665544

Enter the musical Instrument Details

9101:ElectricGuitar:StringInstrument:25000:6:Steel

You have a discount! and your Total Bill is 17584.0


# Sample Input / Output 2

Enter the Customer Details

1234:Alice:9876543210

Enter the musical Instrument Details

5678:AcousticGuitar:StringInstrument:15000:5:Nylon

Total Bill is 15075.0



# Sample Input / Output 3

Enter the Customer Details

1357:Emma:9551234567

Enter the musical Instrument Details

2468:ClassicalGuitar:StringInstrument:18000:4:Chromium

Invalid Input
