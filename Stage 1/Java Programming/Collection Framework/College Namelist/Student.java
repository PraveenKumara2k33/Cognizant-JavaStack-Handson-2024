import java.util.*;

public class Student {
    private List<String> studentList = new ArrayList<String>();

    // Getter for studentList
    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList){
        this.studentList=studentList;
    }
    // Method to add a student to the list
    public void addStudentToList(String student) {
        studentList.add(student);
    }

    // Method to sort the student list
    public void sortStudentList() {
        Collections.sort(studentList);
    }

    // Method to remove a student from the list
    public void removeStudentFromList(String student) {
        studentList.remove(student);
    }
}