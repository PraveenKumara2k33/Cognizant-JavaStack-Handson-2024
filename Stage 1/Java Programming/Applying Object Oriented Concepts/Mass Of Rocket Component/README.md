# Mass Of Rocket Component
## Description

### Objective:

To work with final variable in classes and objects.

#### Scenario:

A group of Aerospace Engineers are involved in the work of manufacturing rocket components for KSVL-47 Rocket. After manufacturing each component, they need to check its weight on Earth, calculate its mass, and provide that information to the scientist team. Mass is calculated using the formula, 

`Mass=Weight on Earth/acceleration due to gravity `

`acceleration due to gravity = 9.8 meters per second square `  

Develop a Java Application to help the Aerospace Engineers team. 

 

# Requirement 1: 

## Component Specification: RocketComponent 

# RocketComponent Class

| Type (Class)     | Attributes                                                                                                            | Responsibilities                                                                                                                                      |
|------------------|-----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| RocketComponent  | - `String name`<br>- `double weight`<br>- `final double accelerationDueToGravity`<br>- `String material`<br>- `double costOfProduction` | - Include the getter and setter methods for all the attributes.<br>- Include a public parametrized constructor of four arguments in the following order: `name`, `weight`, `material`, `costOfProduction` to initialize the values for `RocketComponent` object. |


**Note:** The class and methods should be declared as public, and all the attributes should be declared as private.  

**Note:** acceleration due to gravity = 9.8 meters per second square is constant for all objects on Earth. 

 

# Requirement 2: Calculate the mass of the rocket component. 

## Component Specification: RocketComponent 

| Type (Class)   | Methods                                                                                         | Responsibilities                                                                                                                                                   |
|----------------|-------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RocketComponent| `public double calculateMassOfRocketComponent(double weight)`                                   | This method takes the weight as an argument and calculates the mass using the formula: `Mass = weight / accelerationDueToGravity`. Then returns the calculated mass of the rocket component. Return -1, if weight is less than 1 Newton. Condition: Before returning, round off the calculated mass to 2 decimal places. |


**Note:** The class and methods should be declared as public, and all the attributes should be declared as private. 

 

In the UserInterface class, inside the main method, Prompt the information of the RocketComponent from the user and store the information by passing it to the parameterized constructor. Invoke the method, `calculateMassOfRocketComponent(double weight)` from RocketComponent class, and then display the information as shown in the sample output. 

If the `calculateMassOfRocketComponent` method of RocketComponent class returns -1, then display `"<weight> Newton is an invalid weight"` and terminate the program. 

 

# Sample Input 1: 

Enter the component name 

Payload 

Enter the component weight on earth 

210 

Enter the material used 

Iron 

Enter the cost of production 

12000 

 

# Sample Output 1: 

Rocket Component 

Name : Payload 

Weight : 210.0 Newton 

Acceleration Due To Gravity : 9.8 meters per second square 

Mass : 21.43 kg 

Material Used : Iron 

Cost Of Production : Rs. 12000.0

 

 

# Sample Input 2: 

Enter the component name 

Payload 

Enter the component weight on earth 

-2 

 
# Sample Output 2: 

-2 Newton is an invalid weight 
