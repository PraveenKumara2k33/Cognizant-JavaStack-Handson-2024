# Alta Motors
## Description

### Objective:

To work with hash set in collections.

#### Scenario:

Alta Motors is one of the famous manufacturing companies in the city. They wanted to group the employee IDs with their respective Department names. Help them find valid employee IDs and group them into their corresponding departments.

Write a Java program to implement the above scenario.  

`The above scenario should be implemented using a HashSet.`

# Component Specification: DepartmentGrouping  


| Type (Class)        | Attributes               | Methods                         |
|---------------------|--------------------------|---------------------------------|
| DepartmentGrouping  | `HashSet<String> employeeSet` | Include the getter and setter method. |


**Note:** The class and methods should be declared as public, and all the attributes should be declared as private. 

# Requirement 1: Add the valid employeeId to the HashSet. 

As per this requirement, the system should be able to add valid employeeIds to the HashSet.  

# DepartmentGrouping Class

| Component Name                         | Type (Class)      | Methods                                  | Responsibilities                                                                                                                                                               |
|----------------------------------------|-------------------|------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Add valid employeeId to the HashSet.   | DepartmentGrouping| `public void addEmployeeId(String details)` | This method should extract the employeeId from the given input and add only the valid employeeIds to the HashSet. Validation condition: The employeeId should begin with the letter 'P', 'Q', 'M', or 'S' followed by a 3-digit number. Else the employeeId is invalid and should not be added to the HashSet. Only valid employeeIds are added to the HashSet. |

 

# Requirement 2: Find the department name for a valid employeeIds in the HashSet.

As per this requirement, the system should be able to find the department name of the employeeIds present in the HashSet.  


| Component Name                                           | Type (Class)      | Methods                                               | Responsibilities                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|----------------------------------------------------------|-------------------|-------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Find the department name for the employeeIds in the HashSet | DepartmentGrouping | `public HashSet<String> findDepartmentNameWithEmployeeId()` | This method is used to find the department name of the employeeIds in the HashSet. The employeeIds that start with letter 'P' belong to the "Production" department. The employeeIds that start with letter 'Q' belong to the "Quality Control" department. The employeeIds that start with letter 'M' belong to the "Maintenance" department. The employeeIds that start with letter 'S' belong to the "Sales" department. (Department name is case sensitive) Append the employeeId and the department name. Eg: If employeeId is P987 and the department is Production, the appended string should be P987:Production. Store the appended string in another HashSet and return the same. |


 

In the UserInterface class, call the above methods and display the output as given in the sample input/output. 

If the returning HashSet from `findDepartmentNameWithEmployeeId()` method is empty, then display, `"All the provided employee ids are invalid"`.

**Note:**

- The number of details should be greater than 0. Display `"<number of details> is an invalid input"` if this condition fails. 
- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output. 
- Ensure to follow the object-oriented specifications provided in the question. 
- Ensure to provide the names for classes, attributes, and methods as specified in the question. 
- Adhere to the code template, if provided. 
- **Please don't use System.exit(0) to terminate the program.**
 

# SAMPLE INPUT / OUTPUT 1:

Enter the number of details

4

Enter the details

P567:Paul

M568:John

Q910:Lilly

S178:Dass

Q910:Quality Control

P567:Product

M568:Maintenance

S178:Sales

 

# SAMPLE INPUT / OUTPUT 2:

Enter the number of details

3

Enter the details

E980:Nancy

M876:Maria

Q1234:Tara

M876:Maintenance

**(Explanation: The first (E980) and last(Q1234) are invalid employeeIds)**

 

# SAMPLE INPUT / OUTPUT 3:

Enter the number of details

2

Enter the details

W1235:Riya

O999:Sagar

All the provided employee ids are invalid

 

# SAMPLE INPUT / OUTPUT 4:

Enter the number of details

-2

-2 is an invalid input