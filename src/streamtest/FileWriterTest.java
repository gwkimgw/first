package streamtest;

import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {

        try(FileWriter f4 = new FileWriter("write.txt")) {
           f4.write("A");
           char[] B = {'B', 'C', 'D'};
           f4.write(B);
           f4.write("안녕하세요");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
