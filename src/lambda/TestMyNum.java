package lambda;

public class TestMyNum {
    public static void main(String[] args) {
        MyNumber maxNum  = (x, y) -> (x >= y)? x: y;
        int max = maxNum.getMaxNum(10, 20);
        System.out.println(max);
    }
}
