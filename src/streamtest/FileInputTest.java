package streamtest;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {
        int i = 0;
        FileInputStream f = null;
        try {
            f = new FileInputStream("input.txt");
            while((i = f.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("\nstill alive");
    }
}
