
Description

Objective:

To work with control structures.

Scenario:

Mr. Smith wants to reduce water waste while filling his water tank. He wants to set an alarm when the third-fourth of the tank is filled. Write a Java program to calculate the total capacity of the tank and the capacity for the alarm to ring. Assume that the tank will be cylindrical and will be filled only if it is completely drained. Get the radius and height from the user. Calculate the total volume of the tank with the formula,

Volume of cylinder = Pi * radius * radius * height

If the radius or height is less than or equal to zero, print "Invalid measurement". Otherwise, calculate the total capacity and the capacity for the alarm. The capacity for the alarm is 3/4th of the total capacity. Print the output with 2 decimal places.

System.out.println("%.2f",res);



Note: 

Use Pi value as 3.14 while finding the volume of cylinder.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 
Ensure to follow the object-oriented specifications provided in the question description. 
Ensure to provide the names for classes, attributes, and methods as specified in the question description. 
Adhere to the code template, if provided 
Please do not use System.exit(0); to terminate the program.

Sample Input/Output 1:

Enter the radius

28

Enter the height

42


Total capacity is 103393.92 litres

Capacity for alarm is 77545.44 litres


Sample Input/Output 2:

Enter the radius:

0

Enter the height:

25

Invalid measurement