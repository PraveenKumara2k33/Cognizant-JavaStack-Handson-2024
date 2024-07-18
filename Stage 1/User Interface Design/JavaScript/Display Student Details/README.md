# Display Student Details
## Description

### Objective:

To work with JavaScript functions, constructors, classes, and objects.

#### Problem Description:

Write a JavaScript program to display the Student details. 
Student class 

# Student Information Attributes

| Attribute       | Datatype    |
|-----------------|-------------|
| studentId       | String      |
| studentName     | String      | 
| yearOfPassing   | Date        | 
| department      | String      | 



Create an all-argument constructor to initialize the student class attributes and getter methods to access its value.

# Function Details

| Function Name                  | Function Description                                                                                               |
|--------------------------------|-------------------------------------------------------------------------------------------------------------------|
| `displayStudentDetails(studentId, studentName, yearOfPassing, department)` | This function invokes the `createStudent()` method with `studentId`, `studentName`, `yearOfPassing`, and `department` as arguments. It fetches the returned object and displays: "<studentName> (ID: <studentId>) passed out in <yearOfPassing> from the <department> department." |
| `createStudent(studentId, studentName, yearOfPassing, department)`        | This function creates an object representing a student using `studentId`, `studentName`, `yearOfPassing`, and `department` as arguments. It returns the created object.          |


**Note: You may verify the correctness of your function by invoking it within console.log.**

**Console output screen for console.log(displayStudentDetails("Jpr/123/2018", "John Doe", 2022, "Mechanical"));**

