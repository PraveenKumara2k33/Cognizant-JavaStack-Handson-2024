# Description
## Counting Game 

### Objective:

To work with JavaScript Function, Conditional Statements, and Looping.

#### Problem Description:

In class 2, the teacher wants to engage the students in a counting game that helps them develop number recognition skills and exposes them to basic tables. The teacher decides to come up with interactive instructions for the students using the wordPlay function. Create a simple JavaScript program to create this game. 

This game was created using the wordPlay function. This function's input must be a number larger than 0 and less than 51, and its output must be returned in the following format.

**The guidelines for this game are as follows:**

1. If a number is `greater than 50`, then the function must return `'Input exceeds the range'`.
2. If a number is `less than 1`, then the function must return `'Input falls short of the range'`.
3. If a number lies within the specified range, then the function must iterate through all the numbers within the range,  append each of them to a string with a white-space & return the same. 
4. However, when a number `divisible by both 5 & 3` is encountered,` "Jump" `is appended to the string; When a number `divisible only by 3` is encountered, `"Tap"` is appended to the string; when a number `divisible only by 5` is encountered, `"Clap"` is appended to the string (refer to the console outputs)
**Note: You may verify the correctness of your function by invoking it from within console.log**


**(i) Console output for console.log(wordPlay(16));**

1 2 Tap 4 Clap Tap 7 8 Tap Clap 11 Tap 13 14 Jump 16

**(ii) Console Output for console.log(wordPlay(-16));**

Input falls short of the range

**(iii) Console Output for console.log(wordPlay(166));**

Input exceeds the range
