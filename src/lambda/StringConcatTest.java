package lambda;

public class StringConcatTest {
    public static void main(String[] args) {
//        StringConcatImp stringConcatImp = new StringConcatImp();
//        stringConcatImp.makeString("hello", "java");

        StringConcat stringConcat = (s1, s2) -> System.out.println(s1 + " " + s2);
        stringConcat.makeString("hello", "java");

        StringConcat stringConcat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        stringConcat1.makeString("hello", "java");
    }
}
