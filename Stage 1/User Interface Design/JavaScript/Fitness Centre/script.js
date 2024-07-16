var obj_array = [];

function display() {
    try {
        // Fetch the customer details using DOM functions
        var name = document.getElementById("name").value;
        var age = document.getElementById("age").value;
        var height = document.getElementById("height").value;
        var weight = document.getElementById("weight").value;

        // Validate input values
        if (!name || isNaN(age) || isNaN(height) || isNaN(weight)) {
            throw new Error("Invalid input for name, age, height, or weight.");
        }

        age = parseInt(age);
        height = parseFloat(height);
        weight = parseFloat(weight);

        // Create an object and add it to the array
        var obj = createObject(name, age, height, weight);
        var array = addArray(obj);

        // Iterate the array and display the values in tabular format
        var tableHTML = "<table class='table'><tr><th>Name</th><th>Age</th><th>Height</th><th>Weight</th></tr>";
        array.forEach(item => {
            tableHTML += `<tr><td>${item.name}</td><td>${item.age}</td><td>${item.height}</td><td>${item.weight}</td></tr>`;
        });
        tableHTML += "</table>";

        document.getElementById("result").innerHTML = tableHTML;
    } catch (err) {
        document.getElementById("result").innerHTML = "Function display: " + err.message;
    }
    return false; // Prevent form submission
}

function createObject(name, age, height, weight) {
    try {
        return { name, age, height, weight };
    } catch (err) {
        document.getElementById("result").innerHTML = "Function createObject: " + err.message;
    }
}

function addArray(obj) {
    try {
        obj_array.push(obj);
        return obj_array;
    } catch (err) {
        document.getElementById("result").innerHTML = "Function addArray: " + err.message;
    }
}