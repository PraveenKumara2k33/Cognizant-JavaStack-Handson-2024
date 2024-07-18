import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentUtility {
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Stream<Student> convertToStream() {
        return studentList.stream();
    }

    public List<Student> filterStudentInfo(Stream<Student> studentStream, int score) {
        return studentStream
                .filter(student -> student.getPercentageScore() > score)
                .sorted(Comparator.comparingInt(Student::getPercentageScore).reversed())
                .collect(Collectors.toList());
    }
}
