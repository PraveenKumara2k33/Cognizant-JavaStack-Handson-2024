// Function to populate the ticket dropdown based on the selected event
function eventOnChange() {
    try {
        // Get the selected event value
        let eventSelection = document.getElementById("eventSelection").value;

        // Define the tickets available for each event
        const tickets = {
            "Conference": ["Standard", "VIP"],
            "Workshop": ["Beginner", "Intermediate", "Advanced"],
            "Seminar": ["General", "Student"],
            "Webinar": ["Free", "Paid"]
        };

        // Get the ticket dropdown element
        let ticketDropdown = document.getElementById("ticket");

        // Clear the current options in the ticket dropdown
        ticketDropdown.innerHTML = '<option value="" hidden>--Select--</option>';

        // If an event is selected, populate the ticket dropdown with the corresponding tickets
        if (eventSelection in tickets) {
            tickets[eventSelection].forEach(ticket => {
                let option = document.createElement("option");
                option.value = ticket;
                option.text = ticket;
                ticketDropdown.appendChild(option);
            });
        }
    } catch (err) {
        document.getElementById("result").innerHTML = "Function eventOnChange: " + err;
    }
}

// Function to handle form submission and display the acknowledgment message
function registerEvent() {
    try {
        // Get the values of the selected event and ticket
        let eventSelection = document.getElementById("eventSelection").value;
        let ticketSelection = document.getElementById("ticket").value;

        // Get the result div element
        let resultDiv = document.getElementById("result");

        // Check if both dropdowns have a selection
        if (eventSelection === "" || ticketSelection === "") {
            resultDiv.innerHTML = "Select values from all dropdown menus";
        } else {
            resultDiv.innerHTML = `You have placed the ticket "${ticketSelection}" for the "${eventSelection}" event on our portal!`;
        }
    } catch (err) {
        document.getElementById("result").innerHTML = "Function registerEvent: " + err;
    }
}

// Function to clear the form values
function clearValues() {
    try {
        document.getElementById("eventSelection").value = "";
        document.getElementById("ticket").innerHTML = '<option value="" hidden>--Select--</option>';
        document.getElementById("result").innerHTML = "";
    } catch (err) {
        document.getElementById("result").innerHTML = "Function clearValues: " + err;
    }
}
