# The Perfect Password
## Description


### Objective:

To work with lambda, functional interface.

#### Scenario:

Anna is a software engineer who works for a cybersecurity company. Her team is developing a new password validation system that analyzes the strength of a password by calculating the ASCII sum of its characters. The system then determines whether the password is "perfect" or not based on whether the sum is even or odd. If the password is valid, the program uses a functional interface to calculate the ASCII sum of the password and determine if it's perfect.

Anna is tasked with creating a Java program for the password validation system, help her to automate the process.

Create a public Functional interface, WordSummarizer with the below method. 

`public String summarize(String s)`


In the UserInterface class include the below method:

- `public static WordSummarizer calculateAsciiSum()`: This method must contain a lambda expression that returns a string which states `"<word> is a perfect word"` if the sum of the ASCII values of a word is an even number. If the sum of the ASCII values of a word is an odd number, the lambda expression must return `"<word> is not a perfect word"`.

Inside the main method in the `UserInterface class`, implement the following,

- Get the user input for a word. Verify if the word contains only alphabets and spaces, else display `"<word> is an invalid word"`.
- Invoke the static method `"calculateAsciiSum()"` to calculate the sum of ASCII values for the given word and return the object of WordSummarizer interface.
- Invoke the `"summarize()"` method of the `WordSummarizer` object and pass the input word as parameter.
- Display the result obtained from the `"summarize()"` method as shown in the sample output.

**Note:**   

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.    

- Ensure to follow the object-oriented specifications provided in the question description.   

- Ensure to provide the names for the classes, attributes, and methods as specified in the question description   

- Adhere to the code template, if provided. 

- Implement the static method mentioned above using lambda expression.  Don't create an object for the interface using a new keyword. 

**Do not use System.exit(0) to terminate the program.** 



# Sample Input/output 1:

Enter the word to find the sum:

world

world is a perfect word



# Sample Input/output 2:

Enter the word to find the sum:

software

software is not a perfect word



# Sample Input/output 3:

Enter the word to find the sum:

Hennah@5566

Hennah@5566 is a invalid word