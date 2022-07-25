package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1 = new Desktop();
        Computer c2 = new MyLaptop();
        Laptop l1 = new MyLaptop();
        c1.display();
        l1.display();
    }
}
