# Dazzle Closet
## Description

### Objective:

To work with constructor, classes and objects.

#### Scenario:

Sarah, a fashion lover, opened Dazzle Closet, a shop for everyone. With unique clothes and personal attention, she made it a cozy place to find the perfect outfit. She sought the expertise of a software developer to create a user-friendly application to calculate prices according to size preferences. As a software developer, help her automate the process.

| Type (Class)  | Attributes          | Methods                                                                 |
|---------------|---------------------|-------------------------------------------------------------------------|
| Order         | - `dressCode`: String<br>- `style`: String<br>- `material`: String<br>- `size`: String<br>- `price`: double | - `Order(String dressCode, String style, String material, String size, double price)`: Constructor to initialize all attributes.<br>- `Order()`: Default constructor.<br>- Getter and setter methods for all attributes.<br>Allows accessing and modifying attribute values. |


**Note:** The methods and the constructor should be public, and the attributes of the class should be private. 


# Assumptions:

Assume most of the customers opt for XL size. So, keep the size as "XL" by default. But customers can give input for their preferred size also.

1. If customer preferred `"XL"` size, give input as `'yes/YES'` and skip input for the attribute size and create Order object with four-argument constructor to initialize the values for dressCode, style and material, size as `"XL" and price`.
2. If customer prefer other than XL `(Available Size: S, M, XL, XXL, XXXL, XXXXL)`, give input as 'no/NO' and get size from the user and create Order object with five-argument constructor to initialize all the values. 
3. In the UserInterface class before setting the price in the constructor, if the preferred size is `XXL, XXXL, XXXXL add Rs. 100 more`, if the preferred size is `S, M, XL` directly set the given price.
4. Instead of `Yes / No`, if user enters different input, then display `'Wrong Input'` and get the input again.

**Note:**

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 
- Ensure to follow the object-oriented specifications provided in the question description. 
- Ensure to provide the names for classes, attributes, and methods as specified in the question description. 
- Adhere to the code template, if provided 
- `Please do not use System.exit(0); to terminate the program.`


# Sample Input/Output 1:

Enter dress code

FAO123

Enter dress style

Indo-Western

Enter dress material

Cotton

Enter dress price

599

Prefered size is XL(Yes/No)

Yes

Dress code :FAO123

Dress Style :Indo-Western

Material Type :Cotton

Dress Size :XL

Price :599.0

 

# Sample Input /Output 2:

Enter dress code

KIH789

Enter dress style

Western

Enter dress material

Satin

Enter dress price

1533

Prefered size is XL(Yes/No)

No

Enter the dress size

XXL

Dress code :KIH789

Dress Style :Western

Material Type :Satin

Dress Size :XXL

Price :1633.0
