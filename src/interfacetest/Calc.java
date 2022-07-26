package interfacetest;

public interface Calc {
    //public static final
    double PI = 3.14;
    int ERROR = -999999999;

    //public abstract
    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    default void description() {
        System.out.println("calculator!");
    }

    static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
            total += i;
        }
        return total;
    }
}
