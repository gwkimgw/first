package substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferStreamTest {
    public static void main(String[] args) {
        long mill = 0;

        try(FileInputStream f2 = new FileInputStream("a.exe");
            FileOutputStream f3 = new FileOutputStream("b.exe");
            BufferedInputStream b2 = new BufferedInputStream(f2);
            BufferedOutputStream b3 = new BufferedOutputStream(f3)) {

            mill = System.currentTimeMillis();
            int i = 0;
            while((i = f2.read()) != -1) {
                b3.write(i);
            }
            mill = System.currentTimeMillis() - mill;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(mill);
    }
}
