package streamtest;

import java.io.FileOutputStream;

public class OutputTest {
    public static void main(String[] args) {
        byte[] bs2 = new byte[26];
        byte data = 65;
        for(int i=0;i< bs2.length;i++){
            bs2[i] = data++;
        }

        try (FileOutputStream f3 = new FileOutputStream("output.txt", true)){
            f3.write(bs2);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("still alive");
    }
}
