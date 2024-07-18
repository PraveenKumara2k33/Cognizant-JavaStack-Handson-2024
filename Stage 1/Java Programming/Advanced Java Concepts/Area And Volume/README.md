# Area And Volume
## Description


### Objective:

To work with lambda, functional interface.

#### Scenario:

Create a `public Functional interface, Calculation` with the below method. 

`float areaAndVolumeCalculation(int a);` 

Write a public class `UserInterface` with the methods below. 

`public static Calculation areaOfSquare()`  -  The lambda expression for the areaAndVolumeCalculation method must return the Area of the Square of the parameters passed. 

`Area of the Square=a*a`

`public static Calculation areaOfCircle()`  -  The lambda expression for the areaAndVolumeCalculation method must return the Area of the Circle of the parameters passed. 

`Area of the Circle= a*a*22/7 `

`public static Calculation  volumeOfCube()`  -  The lambda expression for the areaAndVolumeCalculation method must return the Volume of the Cube of the parameters passed. 

`Volume of the Cube= a*a*a `

`public static Calculation  volumeOfSphere() ` -  The lambda expression for the areaAndVolumeCalculation method must return the Volume of the Sphere of the parameters passed. 

`Volume of the Sphere= 4/3*22/7*a*a*a` 

 

Write the main method in `UserInterface` class. 

1. Get the value of a.  

2. Invoke the static methods in the main to do the area and volume calculation. 

3. Capture the object of Calculation that is returned by the static method. 

4. Invoke the areaAndVolumeCalculation method for the inputs received from the user. 

5. Display the result. 

**Condition:** 

- If the value of a is less than or equal to zero, then display `"<a> is an invalid value"`.


**Note:**   

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.    

- Ensure to follow the object-oriented specifications provided in the question description.   

- Ensure to provide the names for the classes, attributes, and methods as specified in the question description   

- Adhere to the code template, if provided. 

- Implement all the static methods mentioned above using lambda expression.  Don't create an object for the interface using a new keyword. 

- **Please don't use System.exit(0) to terminate the program.**

 

# Sample input and output 1: 

Enter a value

14

Area of the Square = 196.0

Area of the Circle = 616.0

Volume of the Cube = 2744.0

Volume of the Sphere = 8232.0

 

# Sample input and output 2: 

Enter a value 

-3 

-3 is an invalid value 