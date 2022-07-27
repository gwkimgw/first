package objecttest;

import java.lang.reflect.Constructor;

public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class pClass = person.getClass();
        System.out.println(pClass.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        String classname = "objecttest.Person";
        Class pClass3 = Class.forName(classname);
        System.out.println(pClass3.getName());

        Constructor[] cons = pClass3.getConstructors();

        for(Constructor c : cons) {
            System.out.println(c);
        }
    }
}
