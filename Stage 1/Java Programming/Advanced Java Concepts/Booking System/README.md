# Booking System
## Description

### Objective:

To work with date.

#### Concept Explanation:

The Date class in Java represents a moment in time with both date and time information, commonly used for time stamping and calendar tasks. For enhanced readability and type safety, the java.time package offers a modern API for date and time manipulation.

#### Concept Implementation:

The UserInterface class in this Java program handles hotel check-in and check-out operations via user input. It prompts users for the check-in date, time and duration of their stay. Using LocalDateTime, it parses input data and calculates the check-out time. If input is invalid, exceptions are caught, and users notified. The output format is specified for printing check-in and check-out details, enhancing the user experience in managing hotel bookings.

#### Scenario:

Olivia wants to develop a hotel booking system that calculates the check-out date and time based on the check-in date, time, and duration of stay. You, as a software developer, have been approached to develop software for Olivia's hotel based on the specifications.

# Requirements: 

- Prompt the user to input the check-in date and time as a string.

- If the check-in date and time are valid, prompt the number of hours of stay from the user.

- Calculate the check-out date and time by adding the hours of stay to the check-in date. 

- Ensure the format of both check-in ,check-out date and time matches the format in sample output before displaying them.

 

**Note:**

- The input format for the check-in date and time should be  `"yyyy/MM/dd HH:mm"`, where time is in `24-hour format`.   

- The output will display the check-in and check-out date and time where date format is `"yyyy-MM-dd"` and time is in `12-hour format` with AM/PM indicator . 

- If the check-in date and time  is not in above mentioned format, then print `"<check-in date time> is an invalid check in date or time"` and terminate the program. 

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.  

- Ensure to follow the object-oriented specifications provided in the question description.  

- Ensure to provide the names for classes, attributes, and methods as specified in the question description.  

- Adhere to the code template, if provided 

- **Please do not use System.exit(0); to terminate the program.**



**Hint : Use DateTimeFormatter and LocalDateTime **

### Assumption:

Number of hours of stay is always valid. (positive integer)



# Sample Input 1 

Enter check in date and time 

2023/12/23 14:32 

Enter number of hours of stay 

4 

# Sample Output 1 

Check in Date and Time is 2023-12-23 02:32 PM 

Check out Date and Time is 2023-12-23 06:32 PM  

 

# Sample Input 2 

Enter check in date and time 

2023/08/20 23:21 

Enter number of hours of stay 

2 

# Sample Output 2 

Check in Date and Time is 2023-08-20 11:21 PM 

Check out Date and Time is 2023-08-21 01:21 AM 

 

# Sample Input 3 

Enter check in date and time 

2023-09-23 14:32 

# Sample Output 3 

2023-09-23 14:32 is an invalid check in date or time

**Explanation:** check-in date is invalid



# Sample Input 4 

Enter check in date and time 

2023/08/20 25:21

# Sample Output 4 

2023/08/20 25:21 is an invalid check in date or time 

**Explanation:** check-in time is invalid