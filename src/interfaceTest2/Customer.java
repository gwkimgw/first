package interfaceTest2;

public class Customer implements Buy, Sell{
    @Override
    public void Buy() {
        System.out.println("buy");
    }

    @Override
    public void Sell() {
        System.out.println("sell");
    }

    @Override
    public void order() {
        System.out.println("new order!");
    }
}
