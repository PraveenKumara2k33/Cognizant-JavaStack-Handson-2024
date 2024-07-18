# Fit Freak
## Description

### Objective:

To work with JDBC.

#### Scenario:

Fit Freak is an inspiring campaign designed to promote a healthy and active lifestyle among individuals. Spearheaded by a passionate and dedicated group of individuals, this initiative aims to improve the overall well-being of people by encouraging them to embrace fitness as a way of life.

Fit Freak's data are available in Database, In order to track the health of the people, they wanted to retrieve the data from the database based on age. Help them to develop this application.   

# Component Specification: FitFreak (Model Class)    


| Type(Class) | Attributes | Methods |
|-------------|------------|---------|
| `FitFreak`    | String fitnessId | Getter and setter methods for all the attributes and four-argument constructor are included in the code skeleton. |
|             | String name      |         |
|             | String gender    |         |
|             | int age          |         |
|             | double height    |         |
|             | double weight    |         |


**Note:** The class and methods should be declared public and all the attributes should be declared as private.     



# Component Specification: FitFreakManagementSystem  


# Requirement 1: Retrieve Fit Freak details from the database.     



| Component Name              | Type (Class)             | Methods                                            | Responsibilities                                                                                           |
|-----------------------------|--------------------------|----------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| Retrieve FitFreak details.  | `FitFreakManagementSystem` | `public List<FitFreak> retrieveFitFreakListBasedOnAge(int age)` | This method should accept age as a parameter and retrieve those FitFreak details from the database whose age is less than or equal to the given age. |


**Note:** The class and methods should be declared as public, and all the attributes should be declared as private.     

Sample records available in the `fitfreak` table are:


| fitnessId | name   | gender | age | height | weight |
|-----------|--------|--------|-----|--------|--------|
| FIT78901  | Alicia | Female | 28  | 165.2  | 58.75  |
| FIT23456  | Ethan  | Male   | 33  | 178.6  | 83.20  |
| FIT65432  | Lily   | Female | 40  | 154.9  | 62.40  |
| FIT12345  | Oliver | Male   | 45  | 182.3  | 95.80  |
| FIT98765  | Sophia | Female | 52  | 169.7  | 70.00  |



To connect to the database, you are provided with the `database.properties` file and `DB.java` file. (Do not change any values in the database.properties and DB.java files) 

In the `UserInterface` class,

- Write the main method and get the input like age from the user.  
- Display the details of FitFreak such as `fitnessId, name, gender, age, height, and weight` for all the fit freaks returned from  `retrieveFitFreakListBasedOnAge()` in `FitFreakManagementSystem` class.
- If the age of FitFreak is not available in the list, the output should be `"No FitFreak records available for the given age"`.


**Note:**    

- Table name is case sensitive.
- Ensure to follow the object-oriented specifications provided in the question description.   

- Ensure to provide the names for classes, attributes, and methods as specified in the question description.   

- Adhere to the code template, if provided.   

- Please ignore the warning message that appears during compilation in the compilation window.

- **Please do not use System.exit(x) to terminate the program.**



# Sample Input / Output 1

Enter the age

28

fitnessId=FIT78901, name=Alicia, gender=Female, age=28, height=165.2, weight=58.75



# Sample Input / Output  2

Enter the age

20

No FitFreak records available for the given age