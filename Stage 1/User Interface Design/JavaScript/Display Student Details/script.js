class Student {
    constructor(studentId, studentName, yearOfPassing, department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.yearOfPassing = yearOfPassing;
        this.department = department;
    }

    getStudentName() {
        return this.studentName;
    }

    getStudentId() {
        return this.studentId;
    }

    getYearOfPassing() {
        return this.yearOfPassing;
    }

    getDepartment() {
        return this.department;
    }
}

function displayStudentDetails(studentId, studentName, yearOfPassing, department) {
    const student = createStudent(studentId, studentName, yearOfPassing, department);
    return `${student.getStudentName()} (ID: ${student.getStudentId()}) passed out in ${student.getYearOfPassing()} from the ${student.getDepartment()} department`;
}

function createStudent(studentId, studentName, yearOfPassing, department) {
    return new Student(studentId, studentName, yearOfPassing, department);
}

// Uncomment the following line to verify the correctness of your function
console.log(displayStudentDetails("Jpr/123/2018", "John Doe", 2022, "Mechanical"));
