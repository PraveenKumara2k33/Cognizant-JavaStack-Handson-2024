Write a class Password Sanitizer with a utility method filter. The filter accepts a lot of pents and filters out those that match any of the following conditions.

- password length is less than 5

- password has only numbers

- password has only letters

Example

`Input:`

p@cl pass@123 word@321 wordpass 987345

`Output:`

pass@123 word@321

Here `'p@c1'` is too short, `'wordpass'` contains `only letters, and '987345'` is all digits, so they are filtered. The two good passwords are returned.

`Constraints`

No password string contains white space, e.g., space, tab, newline.Constraints

- Moparnsend sening contains white space, eg, space rats newline

There is at least one vatid password in the list.