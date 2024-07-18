# Employee Details
## Description

### Objective:

To work with JDBC.

#### Scenario:

Taro Group of companies wants to automate the process within their organization. Employee details are available in the database. The management should have the ability to view employee details based on the department and experience. 

You, being their software consultant have been approached by them to develop an application for the same.  You need to implement a Java program to view all the employee details based on department and salary.  

# Component Specification: Employee (Model Class)

| Type(Class) | Attributes                                                                                               | Methods                                                                                     |
|-------------|----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| Employee    | int employeeId<br>String employeeName<br>String department<br>double salary<br>int experience             | Getters and setters for all the attributes and a five-argument constructor are included in the code skeleton. |



**Note:** The class, methods, and constructor should be declared public, and all the attributes should be declared private.  



# Requirement 1: Retrieve all the employees with the given department and experience. 

The management should have the facility to view employees who are from a specified department and have experience. Hence the system should fetch all the employee details for the given department and experience from the database. Those employee details should be added to an ArrayList and the same needs to be returned.  

# Component Specification: EmployeeManagementSystem 


| Component Name | Type(Class)             | Methods                                                                                                           | Responsibilities                                                                                                                           |
|----------------|-------------------------|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| Retrieve all the employees with the given department and experience. | `EmployeeManagementSystem` | `public ArrayList<Employee> viewEmployeesByDepartmentAndExperience(String department, int experience)`              | This method should accept a department and experience as input parameters and retrieve all the employees from the database based on specified department and when the experience is greater than or equal to the specified experience. Return these details as `ArrayList<Employee>` |
 

**Note:** The class and methods should be declared public, and all the attributes should be declared private.  
The employee table is already created at the backend. The structure of the employee table is: 

| Column Name    | Data Type     |
|----------------|---------------|
| employeeId     | int           |
| employeeName   | varchar(20)   |
| department     | varchar(20)   |
| salary         | double        |
| experience     | int           |



Sample records available in the **employee** table are:

| employeeId | employeeName | department | salary  | experience |
|------------|--------------|------------|---------|------------|
| 2001       | Mathew       | HR         | 25000.0 | 5          |
| 2002       | Lia          | Sales      | 20000.0 | 4          |
| 2003       | Edward       | Admin      | 30000.0 | 5          |
| 2004       | Alice        | Sales      | 35000.0 | 6          |
| 2005       | Ella         | Marketing  | 25000.0 | 3          |



To connect to the database, you are provided with the `database.properties file and DB.java file.` (Do not change any values in the database.properties file and the DB.java file) 

Create a class called `UserInterface` with the main method and get the inputs like department and experience from the user.  

Display the details of employees such as employeeId, employeeName, department, salary, and experience for all the employees returned as ArrayList<Employee> from the method  `viewEmployeesByDepartmentAndExperience in EmployeeManagementSystem` class. 

If no employee is available in the list, the output should be `"No employee records available for the <department> department and <experience> years of experience"`.

**Note:** 

- Table name is case sensitive.
- Ensure to follow the object-oriented specifications provided in the question description. 

- Ensure to provide the names for classes, attributes, and methods as specified in the question description.

- Adhere to the code template, if provided.

- Please ignore the warning message that appears during compilation in the compilation window. 

- **Please do not use System. exit(0) to terminate the program.**


# Sample Input / Output 1:

Enter the department

Sales

Enter the experience

2

EMPLOYEEID EMPLOYEENAME DEPARTMENT SALARY EXPERIENCE

2002 Lia Sales 20000.0 4

2004 Alice Sales 35000.0 6

 

 

# Sample Input / Output 2:

Enter the department

Marketing

Enter the experience

3

EMPLOYEEID EMPLOYEENAME DEPARTMENT SALARY EXPERIENCE

2005 Ella Marketing 25000.0 3



# Sample Input / Output 3:

Enter the department

IT

Enter the experience

2

No employee records available for the IT department and 2 years of experience