# College Namelist
## Description

### Objective:
To work with array list, collections.

#### Scenario:

The MVM college has planned to develop a simple student name list record management system using Java. The system should allow the user to add, remove, and display student records of all students in the system. You as a Java developer, develop a program as per the requirement.  

**Implement the above scenario using an ArrayList.** 

# Component Specification: Student 

| Type (Class) | Attributes         | Methods                                             |
|--------------|--------------------|-----------------------------------------------------|
| Student      | `List<String> studentList` | Getter and setter methods are provided as a part of the code skeleton. |


**Note:** The class and methods should be declared as public and all the attributes should be declared as private.



# Requirement 1: Add student to the ArrayList. 

As per this requirement, the system should be able to add a student to the `ArrayList`. 

# Student Class

| Component Name            | Type (Class) | Methods                                         | Responsibilities                                         |
|---------------------------|---------------|-------------------------------------------------|----------------------------------------------------------|
| Add a student to the ArrayList | Student       | `public void addStudentToList(String student)` | This method is used to add a student to the ArrayList. |
 

# Requirement 2: Sort the student in the ArrayList in alphabetical order. 

As per this requirement, the system should be able to sort the student in alphabetical order.  


| Component Name                             | Type (Class) | Methods                                | Responsibilities                                                                      |
|--------------------------------------------|--------------|----------------------------------------|---------------------------------------------------------------------------------------|
| Sort the student in alphabetical order     | Student      | `public void sortStudentList()`        | This method is used to sort the students in the ArrayList in alphabetical order.       |

 

# Requirement 3: Remove the student from the ArrayList. 

As per this requirement, the system should be able to remove a student from the ArrayList. 



| Component Name                          | Type (Class) | Methods                                            | Responsibilities                                                              |
|-----------------------------------------|--------------|----------------------------------------------------|-------------------------------------------------------------------------------|
| Removes the student from the ArrayList. | Student      | `public void removeStudentFromList(String student)` | This method is used to remove a student from the ArrayList.                   |



In the **UserInterface** class, 

1.Create a main method with the menu as described in the sample Input and Output. 

2.When the user selects option `1.Add`, add the student into the studentList. 

3.When the user selects option `2.Display`, it should display the student in alphabetical order. If the list is empty, it should display `"The student list is empty "`. 

4.When the user selects option `3.Remove`, removes the student from studentList. If the list is empty, it should display `" The student list is empty"`. 

4.When the user selects option `4.Exit`, display the message `"Thank you for using the application"` and terminate the program.  

5.Option can take only values 1 to 4. 



**Note: **

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 

- Ensure to follow the object-oriented specifications provided in the question. 

- Ensure to provide the names for classes, attributes, and methods as specified in the question. 

- Adhere to the code template, if provided. 

`Please don't use System.exit(0) to terminate the program.` 

 

# Sample input and output 1: 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

1 

Enter the student name 

John 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

1 

Enter the student name 

Rose 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

1 

Enter the student name 

Peter 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

2 

John 

Peter 

Rose 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

3 

Enter the student name 

Rose 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

2 

John 

Peter 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

4 

Thank you for using the application 

  

# Sample input and output 2: 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

1 

Enter the student name 

harry 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

1 

Enter the student name 

Ravi 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

2 

Ravi 

harry 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

4 

Thank you for using the application 

  

# Sample input and output 3: 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

3 

The student list is empty 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

4 

Thank you for using the application 


# Sample input and output 4: 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

2

The student list is empty 

1.Add 

2.Display 

3.Remove 

4.Exit 

Enter your choice 

4 

Thank you for using the application 