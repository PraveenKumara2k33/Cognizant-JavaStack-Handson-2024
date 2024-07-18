# Mystic Line
## Description

### Objective:

To work with lambda, functional interface.

#### Scenario:

Mystic Line is a tool used to study the properties of lines. Implement Java code to calculate the slope and midpoint of the line using lambda expressions.

Create a public Functional interface, `Calculate` with the below method. 


`String performCalculation(int x1, int x2, int y1, int y2)`

Write a public class UserInterface with the methods below. 


`public static Calculate calculateSlope() `- The lambda expression for the `perfomCalculation()` method must return the slope of the line for the parameters passed.

**Formula to calculate the slope:**

`Slope =(y2-y1)/(x2-x1)`


`public static Calculate calculateMidpoint()`  -  The lambda expression for the `performCalculation()` method must return the mid point of the line for the parameters passed. 

**Formula to calculate the mid point:**

`MidPoint = ((x1+x2)/2,(y1+y2)/2)`

 

Write the main method in `UserInterface` class. 

1. Get the values of x1,x2,y1,y2.  

2. Invoke the static methods in the main to do the slope and midpoint calculation. 

3. Capture the object of Calculate that is returned by the static method. 

4. Invoke the performCalculation method for the inputs received from the user. 

5. Display the result.

**Notes:**

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 
- Ensure to follow the object-oriented specifications provided in the question description.
- Ensure to provide the names for the classes, attributes, and methods as specified in the question description
- Adhere to the code template, if provided.
- Implement all the static methods mentioned above using lambda expression.  Don't create an object for the interface using a new keyword. 
- **Do not use system.exit() to terminate the code.**


# Sample Input / Output 1

Enter the values for x intercepts and y intercepts

1 2 3 4

Slope of the line is 1

Mid point of the line is (1,3)