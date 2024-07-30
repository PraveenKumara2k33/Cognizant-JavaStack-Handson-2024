
The getFancyName method performs the following actions:

1. Validation:

- Validates the name by calling the validateName method provided in the Validator class.

2. If Validation Succeeds:

- Reverses the entire string.
- Converts upper case letters to lower case.
- Returns the modified string.

3. If Validation Fails:

- Throws an `IllegalArgumentException` with the message `"Try again with valid name"`.

#### Constraints
- The name contains no more than 100 characters.
#### Input Format for Custom Testing
- There is a single line that contains the string `name`.
#### Sample Case 0

#### Sample Input
Kate Winslet

#### Sample Output
telsniw etak

#### Sample Case 1

#### Sample Input
Kate Wins?let

#### Sample Output
java.lang.IllegalArgumentException: Try again with valid name


#### Explanation

`Invalid characters` are found in the name, so the required exception is thrown with the message `"Try again with valid name."`.