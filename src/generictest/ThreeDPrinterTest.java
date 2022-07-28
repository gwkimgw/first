package generictest;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        System.out.println(printer);
//        Powder powder = (Powder) printer.getMaterial();
    }
}
