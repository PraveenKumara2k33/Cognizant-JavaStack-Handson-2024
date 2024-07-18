# Vintage Books Emporium
## Description

### Objective:

To work with streams.

#### Scenario:

A book shop named Vintage Books Emporium in the neighbourhood has approached you to create an application to manage their book inventory and assist customers in estimating the total cost of books they wish to purchase. As a Java developer, your task is to create a Java application that allows the shopkeeper to add books to the inventory and enables him to calculate the total bill amount based on the books purchased by the customer.

The application should provide functionalities to add books to the inventory and view all available books, and it should calculate the total cost of purchase based on the titles of the books the customer wishes to purchase.

You are provided with a code template which includes the following classes:

# Component Specification:  Book


| Type (Class)  | Attributes         | Methods                                                                 | Responsibilities                                                                                                                 |
|---------------|--------------------|-------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| Book          | String title       | Getter and setter methods for all the attributes are included in the code skeleton.        |                                                                                                                                 |
|               | String author      | A no-argument and a three-argument constructor in the following order -title, author, price to initialize the values for the Book object are provided as a part of code skeleton. |                                                                                                                                 |
|               | int price          |                                                                         |                                                                                                                                 |


**Note:** The class and constructor are kept public, and all the attributes are declared private.

# Component Specification:  BookStoreUtility

# BookStoreUtility Class

| Type (Class)     | Attributes       | Methods                                                             | Responsibilities                                                                                                                                                     |
|------------------|------------------|---------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| BookStoreUtility | List<Book> bookList | Appropriate getter, setter, no-argument constructor and a three-argument constructor are provided as a part of the code skeleton. |                                                                                                                                                                     |
|                  |                  | public void addBook(Book bookObj)                                   | This method should add the Book object into the bookList                                                                                                             |
|                  |                  | public int calculateTotalPurchaseCost(Stream<Book> bookStream)      | This method must calculate the total purchase cost of all books in the given stream. It takes a stream of Book objects as input, extracts the price of each book, converts the prices to integers, and then adds up all the prices to find the total purchase cost. Finally, it returns this total cost as an integer. |


**Note:** The class, constructor and methods are kept public, and the attribute is declared private.

You are provided with a partial implementation of the `UserInterface class`, which serves as the interface for interacting with a bookstore application.

Complete the implementation of the UserInterface class by filling in the code for Option 2 to calculate and display the total purchase cost of all books in the store. Enclose your code in the respective required blocks alone.

**For option2:** Retrieve the list of books as per the functional requirements. If the list is empty, display `"There are no books available. Try to add books."` Otherwise, display the total purchase cost as `"The total purchase cost is Rs <total purchase cost>"`.

Do not edit or delete the codes provided in the code template.

**Note:**

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

- Ensure to follow the object-oriented specifications provided in the question description.

- Ensure to provide the names for the classes, attributes, and methods as specified in the question description.

- Adhere to the code template, if provided.

 

# Sample Input/ Output 1:

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

1

Enter the book title

Three Act Tragedy

Enter the author name

Agatha Christie

Enter the book price

445

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

1

Enter the book title

Ghost Of The Silent Hills

Enter the author name

Anita Krishnan

Enter the book price

560

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

2

The total purchase cost is Rs 1005

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

3

Thank you!!!

 

# Sample Input/ Output 2:

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

2

There are no books available.Try to add books

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

3

Thank you!!!

 

# Sample Input/ Output 3:

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

4

Invalid option. Please try again.

Select an option:

1.Add Books

2.Calculate Purchase Cost

3.Exit

3

Thank you!!!