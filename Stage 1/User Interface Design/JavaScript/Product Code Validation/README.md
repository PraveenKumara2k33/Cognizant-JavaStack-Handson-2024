Product Code Validation
Description
Product Code Validation

Objective:

To work with JavaScript functions and Regular expressions.

Problem Description:

In an e-commerce platform, the product management team has implemented a validation mechanism for product codes to ensure consistent and accurate identification of their products.  Help them to validate Product Codes by writing a JavaScript program.

Requirements:
The product code should follow a specific format consisting of eight characters, starting with the special character "#", followed by four uppercase letters, and then three digits from 0 to 9.

Implementation:
A JavaScript function named validateProductCode() has been developed. This function takes a product code as input and checks if it adheres to the defined format.

If the product code satisfies the above pattern, then the validateProductCode() function should return the string: "Product code verified successfully". If not, return the string: "Product code is not valid". 

(i) For console.log(validateProductCode('#SFGT878')) : 

Product code verified successfully

(ii) For console.log(validateProductCode('#SFGtR98')) : 

Product code is not valid