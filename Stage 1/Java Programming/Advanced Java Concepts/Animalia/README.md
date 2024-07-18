# Animalia
## Description

### Objective:

To work with streams.

#### Scenario:

You are tasked with creating a Java application for managing animal details and calculating distinct animals count based on the user's input.
Functional Requirements:

1. Retrieve distinct (without duplicates) animal details.

2. Find the count of distinct animals. 

# Component Specification: Animal (POJO Class) 


| Type (Class) | Attributes                         | Methods                                                          |
|--------------|------------------------------------|------------------------------------------------------------------|
| Animal       | String animalName                  | Getters, Setters, no-argument, and three-argument constructors are given in the code skeleton. |
|              | String isDomesticOrWild            |                                                                  |
|              | String habitat                     |                                                                  |


 

**Note:** The class and methods should be declared as public, and all the attributes should be declared as private.    

# Component Specification: AnimalUtil

# AnimalUtil Class

| Type (Class) | Methods | Responsibilities |
|--------------|---------|------------------|
| AnimalUtil   | `public List<Animal> retrieveDistinctAnimals(Stream<Animal> animalStream)` | This method accepts a Stream of `Animal objects` as input and returns a List of distinct Animal objects. It accomplishes this by comparing the values of the relevant attributes and overriding the `hashcode() and equals() methods`. |
|              | `public long countOfTotalDistinctAnimals(Stream<Animal> animalStream)`     | This method takes a Stream of `Animal objects` as input parameters and returns a count of distinct animals. It accomplishes this by comparing the values of the relevant attributes and overriding the `hashcode() and equals() methods`. |


**Note:** The class and methods should be declared as public, and all the attributes should be declared as private.    

  

**Note:** 

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.  

- Ensure to follow the object-oriented specifications provided in the question description.  

- Ensure to provide the names for classes, attributes, and methods as specified in the question description. 

- Adhere to the code template, if provided.  

- Assume that the number of animal details needed to be entered on the list is always a valid positive number. 

- **Do not use System.exit(0) to terminate the program.**

- Assume that the animal's details are always valid and case-insensitive. 

 

# Sample Input 


Enter the Number of animals

7

Enter the animal details

Lion:Wild:Africa

Tiger:Wild:Asia

Elephant:Wild:Africa

Tiger:Wild:Asia

Cow:Domestic:Worldwide

Horse:Domestic:Worldwide

Elephant:Wild:Africa

# Sample Output 

Distinct Animal Details

Lion:Wild:Africa

Tiger:Wild:Asia

Elephant:Wild:Africa

Cow:Domestic:Worldwide

Horse:Domestic:Worldwide

Total Count of Distinct Animals : 5