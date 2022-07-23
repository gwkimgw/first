package singletontest;

public class Company {
    private static Company instance = new Company();
    private Company(){}

    public static Company getInstance() {
        return instance;
    }
}
