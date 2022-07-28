package interfacetest2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.Buy();
        buyer.order();

        Sell sell = customer;
        sell.Sell();
        sell.order();
    }
}
