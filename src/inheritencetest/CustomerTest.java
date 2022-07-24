package inheritencetest;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        int price = customerLee.calcPrice(10000);
        System.out.println(price + "" + customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10011, "Kim", 100);
        price = customerKim.calcPrice(10000);
        System.out.println(price + "" + customerKim.showCustomerInfo());

        Customer customerOver = new VIPCustomer(10112, "Over", 100);
        price = customerOver.calcPrice(10000);
        System.out.println(price + "" + customerOver.showCustomerInfo());

        Customer customerGold = new GoldCustomer();
    }
}
