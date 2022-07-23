package statictest;

public class Student {
    private static int serialNum = 10000;

    public static int getSerialNum() {
        return serialNum;
    }

    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }
}
