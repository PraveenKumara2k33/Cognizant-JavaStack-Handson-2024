# Student Score Info
## Description

### Objective:

To work with streams

#### Scenario:

University of Toronto organizes a carrier fair for final semester students every year. They wish to group and filter the student info based on the percentage score of the students. Develop a Java application for the same using Streams.

# Component Specification: Student (POJO Class)


| Type (Class) | Attributes                          | Methods                                                                                                  |
|--------------|-------------------------------------|----------------------------------------------------------------------------------------------------------|
| Student      | String studentId                    | Getters, Setters, no-argument constructor, 3-argument constructor, and toString method are provided as part of the code skeleton. |
|              | String studentName                  |                                                                                                          |
|              | int percentageScore                 |                                                                                                          |


# Component Specification: StudentUtility


| Type (Class) | Attributes                          | Methods                                                                                                  |
|--------------|-------------------------------------|----------------------------------------------------------------------------------------------------------|
| Student      | String studentId                    | Getters, Setters, no-argument constructor, 3-argument constructor, and toString method are provided as part of the code skeleton. |
|              | String studentName                  |                                                                                                          |
|              | int percentageScore                 |                                                                                                          |


**Note:** The class and methods should be declared as public, and all the attributes should be declared as private.

**Assumption:**

- The `studentId` should be any valid alpha-numeric String. `( Eg: ST121)`
- `percentageScore` is a valid positive integer between 1 and 100. `(Eg: 83)`
**Note:**

- When there is no student found in the record for the given score, then print the message as `"No Student found".`
- Input records is in the format - `studentId/studentName/percentageScore`
**Eg: JK452/Michale/93**

 In `UserInterface class`, in the main method, get the number of student details to enter. It should be a positive integer (greater than 0). Otherwise print "Invalid number of students ".

Then get the student details from the user as shown in the sample input and display the filtered student info as shown in the sample output.

**Note:**

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

- Ensure to follow the object-oriented specifications provided in the question description.

- Ensure to provide the names for classes, attributes, and methods as specified in the question description.

- Adhere to the code template, if provided.

**Do not use System.exit(0) to terminate the program.**



# Sample Input 1

Enter the number of students:

4

Enter the student details:

MQ664/Ria/92

LR810/Robert/75

JK991/Tom/88

UC224/Leema/83

Enter the score to search:

80

# Sample Output 1

Filtered student info whose score is above 80:

Student Id:MQ664  Student Name:Ria  Score:92

Student Id:JK991  Student Name:Tom  Score:88

Student Id:UC224  Student Name:Leema  Score:83



# Sample Input 2

Enter the number of students:

2

Enter the student details:

GD117/Jhon/77

FR269/Kent/78

Enter the score to search:

80

Sample Output 2

No Student found

 

# Sample Input 3

Enter the number of students:

0

Sample Output 3

Invalid number of students