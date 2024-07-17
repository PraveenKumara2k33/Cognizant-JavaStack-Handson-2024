# Investment Calculation

# Description

## Objective:

To work with classes and objects, static modifier.

Scenario:

Create a class Investment with the following private variables:

int companyId

String companyName

static int noOfShares

double valueOfOneShare

 

Include getters and setters methods in the Investment class. (Getters and Setters names should be similar to attribute name)

The noOfShares should hold only positive integer values. Zero and negative values are not allowed. (This logic should be checked inside the corresponding setter method)

 

Write the following method in the Investment class:

`public double calculateTotalAmountOfInvestment(int sharesBought)` - This method should check the availability of the shares, If the shares are available, reduce the sharesBought from noOfShares and calculate the total amount of investment as, 

`sharesBought * valueOfOneShare (roundoff to one decimal value)`

and return the total amount of investment. If the shares are not available, this method should return -1 then display "Shares not available" and terminate the program.

Write a main method in the UserInterface class to test the application.

  

# SAMPLE INPUT AND OUTPUT 1:

Enter the number of company shares you bought

2

Enter total number of shares

150

Enter the company id

118

Enter the company name

ASSER

Enter the number of shares you bought

100

Enter the value of one share

2000

Total number of shares=150

Total amount of investment=200000.0

Remaining Available shares=50

Enter the company id

119

Enter the company name

BOWX

Enter the number of shares you bought

20

Enter the value of one share

10000

Total number of shares=50

Total amount of investment=200000.0

Remaining Available shares=30

 

 

# SAMPLE INPUT AND OUTPUT 2:

Enter the number of company shares you bought

2

Enter total number of shares

25

Enter the company id

111

Enter the company name

RRDS

Enter the number of shares you bought

5

Enter the value of one share

1000

Total number of shares=25

Total amount of investment=5000.0

Remaining Available shares=20

Enter the company id

112

Enter the company name

YEBS

Enter the number of shares you bought

25

Enter the value of one share

2000

Shares not available
