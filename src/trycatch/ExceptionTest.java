package trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
//        FileInputStream fileInputStream = null;
//
//        try {
//            fileInputStream = new FileInputStream("a.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//            System.out.println("finally finally!");
//        }

        try (FileInputStream fileInputStream = new FileInputStream("a.txt")){

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("still alive");
    }
}
