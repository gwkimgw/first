package substream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStreamTest {
    public static void main(String[] args) {
        try (InputStreamReader f1 = new InputStreamReader(new FileInputStream("input3.txt"))) {
            int i = 0;
            while((i = f1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
