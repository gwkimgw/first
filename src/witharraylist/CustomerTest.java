package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "Lee");
        Customer customerShin = new Customer(10020, "Shin");
        GoldCustomer customerHong = new GoldCustomer(10030, "Hong");
        GoldCustomer customerYul = new GoldCustomer(10040, "Yul");
        VIPCustomer customerKim = new VIPCustomer(10050, "Kim", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);


        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }


        int price = 10000;
        for(Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "and" + cost);
            System.out.println(customer.getCustomerName() + "and" + customer.bonusPoint);
        }
    }
}