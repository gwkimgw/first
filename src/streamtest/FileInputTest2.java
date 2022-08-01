package streamtest;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
    public static void main(String[] args) {
        try {
            FileInputStream f2 = new FileInputStream("input2.txt");
            byte[] bs = new byte[10];
            int i;
            while((i = f2.read(bs)) != -1) {
//                for(byte b : bs) {
                for(int j=0;j<i;j++) {
                    System.out.print((char) bs[j]);
                }
                System.out.println("\n");
            }
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}
