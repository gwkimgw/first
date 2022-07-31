package lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString printString = str -> System.out.println(str);
        printString.showString("test");

        showMyString(printString);

        PrintString printString1 = returnPrint();
        printString1.showString("hello");
    }

    public static void showMyString(PrintString lambda) {
        lambda.showString("test2");
    }

    public static PrintString returnPrint() {
        return s -> System.out.println(s + " world");
    }
}
