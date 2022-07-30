package innerclass;

class Outer2{
    int num = 100;
    static int snum = 200;

    public Runnable getRunnable(int i){
        int localnum = 300;

        return new Runnable() {
            @Override
            public void run() {
//                i += 100;
                System.out.println(num);
                System.out.println(snum);
                System.out.println(localnum);
                System.out.println(i);
            }
        };
    }

    Runnable runner = new Runnable() {

        @Override
        public void run() {
            System.out.println("Runnable");

        }
    };
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.getRunnable(400).run();

        outer2.runner.run();
    }
}
