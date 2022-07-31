package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();

        sList.add("bbb");
        sList.add("aaa");
        sList.add("ccc");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
