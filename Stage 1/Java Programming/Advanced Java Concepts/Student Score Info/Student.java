public class Student {
    private String studentId;
    private String studentName;
    private int percentageScore;

    public Student() {
        super();
    }

    public Student(String studentId, String studentName, int percentageScore) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.percentageScore = percentageScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPercentageScore() {
        return percentageScore;
    }

    public void setPercentageScore(int percentageScore) {
        this.percentageScore = percentageScore;
    }

    @Override
    public String toString() {
        return "Student Id:" + studentId + "  student Name:" + studentName + "  Score:" + percentageScore;
    }
}
