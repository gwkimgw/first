package streamtest;

import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        System.out.println("input alphabet");
        int i = 0;
        try {
            while((i = System.in.read()) != '\n'){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
