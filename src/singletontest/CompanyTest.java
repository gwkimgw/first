package singletontest;

public class CompanyTest {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();

        System.out.println(c1);
    }
}
