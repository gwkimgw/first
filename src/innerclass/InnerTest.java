package innerclass;

class Outer{
    private static int sNum = 20;
    private Inner inner;

    public Outer(){
        inner = new Inner();
    }

    class Inner{
        int inNum = 200;

        void inTest() {
            System.out.println(sNum);
        }
    }

    public void usingInTest() {
        inner.inTest();
    }

    static class InnerStatic{
        static int sNum2 = 200;

        void inTest(){
            sNum += 10;
        }

        static void sTest(){
            System.out.println(sNum);
            System.out.println(sNum2);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        outer.inner.inTest();
        outer.usingInTest();

        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        Outer.InnerStatic.sTest();
    }
}
