package interfaceTest2;

public interface Sell {
    void Sell();

    default void order() {
        System.out.println("sell order");
    }
}
