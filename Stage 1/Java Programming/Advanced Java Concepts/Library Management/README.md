# Library Management
## Description

### Objective:

To work with threads.

#### Scenario:

Libraries rely on library management systems to manage asset collections as well as relationships with their members. Library management systems help libraries keep track of their documents inventory and loans, and member subscriptions and profiles, sometimes for multiple physical locations. This type of software can be used by educational institutions libraries, as well as public or private libraries. 

Chetan Library is one of the emerging libraries in the city. They have a huge stock of Engineering books. Develop a java application for them using threads.

# Component Specification: Book (POJO Class)

| Type (Class) | Attributes  | Methods |
|--------------|-------------|---------|
| Book         | String bookId       | Getters and setters methods for all the attributes and 5 argument constructor are included in the code skeleton. |
|              | String bookName     |         |
|              | String bookType     |         |
|              | String bookCategory |         |
|              | String bookEdition  |         |


 

# Requirements:

- To count the number of books with the same book name.

**Component Specification: BookUtility (Thread Class)**

| Type (Class) | Attributes | Methods | Responsibilities |
|--------------|------------|---------|------------------|
| BookUtility  | List<Book> bookList | Include getters and setter methods for all the attributes. | |
|              | String searchbookName | | |
|              | int counter | | |
| BookUtility  | public void toValidateBookType(Book obj) | Check whether the book type is valid or not. If the book type is under the category of "Engineering" (case insensitive), then add the object to the list. If it fails, throw an InvalidBookException with an error message "Book type Invalid". |
| BookUtility  | public void run() | Calculate the count of the books available as the searched book name. |
   

 

**Note:** The class and methods should be declared as public and all the attributes should be declared as private.

# Component Specification: InvalidBookException

| Type (Class)        | Methods                                    | Responsibilities                                            |
|---------------------|--------------------------------------------|-------------------------------------------------------------|
| `InvalidBookException` | public InvalidBookException(String message) | To set the message string to the superclass.                |




**In the UserInterface class, inside the main method, perform the tasks given below:**

- Get the inputs from the user as provided in the sample input.
- Book details are entered in the following pattern. `bookId/bookName/bookType/bookCategory/bookEdition`.
- Set the book records to the book list if the book type is valid. 
- Handle the `InvalidBookException` from the main method. 
- Get the book name from the user to count the number of books available with the same book name. 
- Display the output as shown in the sample input/output.
- If the requested book is not found in the list, then display the message `"No Books found"`.

**Note:**

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
- Ensure to follow the object-oriented specifications provided in the question description.
- Ensure to provide the names for classes, attributes, and methods as specified in the question description.
- Adhere to the code template, if provided.

**Do not use System.exit(0) to terminate the program**

# Sample Input/Output 1:

Enter the number of entries

3                                      

Enter the bookId/bookName/bookType/bookCategory/bookEdition

12/power system transients/engineering/Electrical/2

14/power system transients/engineering/Electrical/3

11/soil mechanics/engineering/Civil/1

Print the book details

bookId=12, bookName=power system transients, bookType=engineering

bookId=14, bookName=power system transients, bookType=engineering

bookId=11, bookName=soil mechanics, bookType=engineering

Enter book name to search

power system transients

Count of books in the library with the book name POWER SYSTEM TRANSIENTS is 2



# Sample Input/Output 2:

Enter the number of entries

2

Enter the bookId/bookName/bookType/bookCategory/bookEdition

34/design of concrete structures/engineering/civil/2

45/harry potter/literature/fiction/1

Book type Invalid



# Sample Input/Output 3:

Enter the number of entries

2

Enter the bookId/bookName/bookType/bookCategory/bookEdition

34/design of concrete structures/engineering/civil/2

67/digital signal processing/engineering/electronics/4

Print the book details

bookId=34, bookName=design of concrete structures, bookType=engineering

bookId=67, bookName=digital signal processing, bookType=engineering

Enter book name to search

embedded systems

no books found