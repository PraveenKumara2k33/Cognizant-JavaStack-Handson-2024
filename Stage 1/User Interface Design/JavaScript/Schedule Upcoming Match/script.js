function displayDay(matchDate) {
    var date = new Date(matchDate);

    if (isNaN(date)) {
        return "Invalid date. Please provide a valid date.";
    }
    // Get the day of the week as a string
    const daysOfWeek = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    const dayName = daysOfWeek[date.getDay()];

    // Check if the day is a weekend
    if (dayName === "Saturday" || dayName === "Sunday") {
        return `The cricket match is scheduled on ${dayName}, which is a weekend.`;
    } else {
        return `The cricket match is scheduled on ${dayName}.`;
    }
}

// Test cases
console.log(displayDay("2023-06-23")); // Output: The cricket match is scheduled on Friday.