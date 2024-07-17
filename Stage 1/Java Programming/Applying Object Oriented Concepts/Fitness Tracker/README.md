Fitness Tracker
# Description

# Objective:

To work with interface, static method.

Scenario:

ABC Fitness, a leading fitness center, wants to create a software tool to help their clients track their daily fitness activities. The tool should have the capability to monitor metrics such as calories burnt, steps taken, distance covered, and other relevant data. It should also provide insights and recommendations based on the clients' fitness goals and progress. As a software developer, you have been tasked with creating the software tool to meet ABC Fitness's requirements.

# Component Specification: UserFitnessData (Class)

| Type (Class)    | Attributes                                       | Responsibilities                                                                                               |
|-----------------|--------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| UserFitnessData | - `String userName`<br>- `double weight`<br>- `int stepsTaken`<br>- `double distanceCovered`<br>- `boolean runningStatus` | - Appropriate setters and getters are provided as part of the code skeleton.<br>- Constructors:<br>  - No-argument constructor<br>  - Six-argument constructor in the order: `userName`, `weight`, `stepsTaken`, `distanceCovered`, and `runningStatus` to initialize the values for the `UserFitnessData` object. |


 Note: The class, constructors, and methods should be declared public and all the attributes should be declared private.

# Component Specification: FitnessMonitor (Interface)


| Type (Interface) | Methods                                                                                   | Responsibilities                                                                                                 |
|------------------|-------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| FitnessMonitor   | `public abstract String findFitnessLevel()`                                               | - This method defines a contract to find the fitness level, optionally marked as abstract. Implementations should provide logic to determine and return the fitness level. |
|                  | `public static double calculateCaloriesBurnt(double weight, double distanceCovered, boolean runningStatus)` | - This static method calculates the calories burnt based on the weight, distance covered, and running status attributes. It can be directly implemented within the interface. |


 

# Requirement 1: Calculate the fitness level of the user.


| Type (Class)    | Methods                                         | Responsibilities                                                                                               |
|-----------------|-------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| UserFitnessData | `public String findFitnessLevel()`              | - This method calculates the fitness level based on the fitness score, which is derived from `stepsTaken`, `distanceCovered`, and `weight` of the user.<br>- Returns the fitness level based on the calculated fitness score.<br>- Refer to the formula below for fitness level calculation. |


 

# Formula to calculate the fitness level of the user:

`FitnessScore = [(0.1 x stepsTaken) + (1.8 x distanceCovered)] / weight in kilograms`


| Fitness Score | Fitness Level |
|---------------|---------------|
| <=5           | Low           |
| <=10          | Moderate      |
| >=11          | High          |
 

# Example:

Suppose a user has taken 8000 steps and covered a distance of 5 kilometers in a day. Their weight is 70 kilograms.


### FitnessScore = [(0.1 x 8000) + (1.8 x 5)] / 70

### FitnessScore = (800 + 9) / 70

### FitnessScore = 11.557142857142857

### Fitness Level = High


# Requirement 2: Calculate the calories burnt per day.

# FitnessMonitor Class

| Type (Class)    | Methods                                                                                   | Responsibilities                                                                                                 |
|-----------------|-------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| FitnessMonitor  | `public static double calculateCaloriesBurnt(double weight, double distanceCovered, boolean runningStatus)` | - This static method calculates the calories burnt based on the `weight`, `distanceCovered`, and `runningStatus` parameters.<br>- If `runningStatus` is `true`, it calculates the calories burnt using the formula: Calories Burnt = 0.75 * weight * distanceCovered.<br>- If `runningStatus` is `false`, it calculates the calories burnt using the formula: Calories Burnt = 0.53 * weight * distanceCovered.<br>- Returns the calculated calories burnt as a result. |


 

The UserInterface class prompts the user to enter their username, weight, stepsTaken, distanceCovered, and runningStatus. The data is then passed to a UserFitnessData object, which calculates the user's fitness level using the `fndFitnessLevel()` method and the number of calories burnt using the `calculateCaloriesBurnt()` method from the FitnessMonitor interface. The results are then displayed to the user as per in the sample output.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
- Ensure to follow the object-oriented specifications provided in the question.
- Ensure to provide the names for classes, attributes, and methods as specified in the question.
- Adhere to the code template, if provided.
- `Please do not use System.exit(0); to terminate the program.`
- To get two decimal places, refer to the print statement mentioned below:

`System.out.printf("%.2f",res);`
 

# Sample Input 1:

Enter user name:

John Doe

Enter weight in kg:

75

Enter number of steps taken:

1100

Enter distance covered in km:

2.2

Is the user running?(true/false):

false

# Sample Output 1:

User Name: John Doe

Weight: 75.0 kg

Steps Taken: 1100

Distance Covered: 2.2 km

Running: false

Fitness Level: Low

Calories Burnt: 87.45

 

# Sample Input 2:

Enter user name:

Kevin William

Enter weight in kg:

70

Enter number of steps taken:

8000

Enter distance covered in km:

5

Is the user running?(true/false):

true

# Sample Output 2:

User Name: Kevin William

Weight: 70.0 kg

Steps Taken: 8000

Distance Covered: 5.0 km

Running: true

Fitness Level: High

Calories Burnt: 262.50
