package substream;

import java.io.*;

public class DataInOutStreamTest {
    public static void main(String[] args) {
        try(FileOutputStream f4 = new FileOutputStream("data.txt");
            DataOutputStream d4 = new DataOutputStream(f4)) {
            d4.write(100);
            d4.writeInt(10);
            d4.writeChar('A');
            d4.writeUTF("hello java");
        } catch (IOException e) {
            System.out.println(e);
        }

        try(FileInputStream f5 = new FileInputStream("data.txt");
            DataInputStream d5 = new DataInputStream(f5)) {
            System.out.println(d5.read());
            System.out.println(d5.readInt());
            System.out.println(d5.readChar());
            System.out.println(d5.readUTF());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
