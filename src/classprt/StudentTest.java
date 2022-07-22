package classprt;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "Lee";
        studentLee.studentID = 100;
        studentLee.address = "Seoul seoul seoul";

        Student studentKim = new Student();
        studentKim.studentName = "Kim";
        studentKim.studentID = 200;
        studentKim.address = "Seoul seoul seoul";

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();
    }
}