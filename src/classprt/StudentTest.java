package classprt;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "Lee";
        studentLee.address = "Seoul";

        studentLee.showStudentInfo();
    }
}