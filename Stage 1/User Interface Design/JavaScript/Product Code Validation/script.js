function validateProductCode(productCode) {
    // Define the regular expression pattern
    var regex = /^#[A-Z]{4}\d{3}$/;

    // Test if the product code matches the regex
    if (regex.test(productCode)) {
        return "Product code verified successfully";
    } else {
        return "Product code is not valid";
    }
}

// Test the function with an example product code
// console.log(validateProductCode('#SFGT878')); // Output: Product code verified successfully
// console.log(validateProductCode('#SFGtR98')); // Output: Product code is not valid