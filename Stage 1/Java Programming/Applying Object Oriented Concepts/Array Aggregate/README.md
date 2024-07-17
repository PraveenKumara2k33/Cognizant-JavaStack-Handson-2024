Array Aggregate
Description

Objective:

To work with exception handling.

Scenario:

Write a Java program that calculates the sum of elements in an array based on the input string provided by the user. The input string should be in the format `'arraySize:element1:element2:...' `[i.e. the first element of the input string represents the array size, and the remaining elements are considered as array elements].


Requirements:

- The method `"public static String sumOfArrays(String data)"` in the `UserInterface` class parses the input string to extract the array size and elements and performs the validations on the input.
- If the array size is negative, the `sumOfArrays` method should throw a `NegativeArraySizeException` with the message `"Provide a positive Integer to allocate memory for the array".` 
- If the array size or array elements are not valid integer values, the method should throw a `NumberFormatException` with the message `"Provide a valid Integer'`.
- If the array size or array elements exceed the given array size, the method should throw an `ArrayIndexOutOfBoundsException` with the message `"Error: Array index is out of range"`.
- In the main method, include try catch blocks for handling this exception and print the message appropriate message in the handling block. 
- If the array size and array values are in the proper format, the method should calculate the sum of array elements and return a message indicating the sum of the array, as `"Sum of the array elements is <calculated sum>"`. 
- The `sumOfArrays()` method should return a message indicating the sum of the array and this result should be captured in the main method and printed.


`Note:`

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 
- Ensure to follow the object-oriented specifications provided in the question description.
- Ensure to provide the names for the classes, attributes, and methods as specified in the question description
- Adhere to the code template, if provided.
- `Do not use System.exit(0) to terminate the code.`

# Sample Input / Output 1
Enter the data

5:3:2:9:8:8

Sum of the array elements is 30



# Sample Input / Output 2


Enter the data

fge:45:27:56

Provide a valid Integer



# Sample Input / Output 3

Enter the data

-2:2:6

Provide a positive Integer to allocate memory for the array



# Sample Input / Output 4

Enter the data

2:10:20:30:40

Error: Array index is out of range