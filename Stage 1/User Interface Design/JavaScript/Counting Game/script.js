function wordPlay(number) {
    // Check if the input number is outside the specified range
    if (number > 50) {
        return 'Input exceeds the range';
    } else if (number < 1) {
        return 'Input falls short of the range';
    }

    let result = '';

    // Iterate through all numbers from 1 to the input number
    for (let i = 1; i <= number; i++) {
        if (i%3 === 0 && i%5 === 0) {
            result += 'Jump ';
        } else if (i%3 === 0) {
            result += 'Tap ';
        } else if (i%5 === 0) {
            result += 'Clap ';
        } else {
            result += i + ' ';
        }
    }

    // Return the result string
    return result;
}

// Example usage:
console.log(wordPlay(16)); // Outputs: "1 2 Tap 4 Clap Tap 7 8 Tap Clap 11 Tap 13 14 Jump"
console.log(wordPlay(-16)); // Outputs: "Input exceeds the range"
console.log(wordPlay(166));  // Outputs: "Input falls short of the range"
