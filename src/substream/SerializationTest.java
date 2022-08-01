package substream;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = -1503252402544036183L;
    String name;
    transient String job;

    public Person() {}
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String toString() { return name + "," + job; }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person personAhn = new Person("Ahn", "CEO");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(personAhn);
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Object obj = ois.readObject();
            if(obj instanceof Person) {
                Person p1 = (Person) obj;
                System.out.println(p1);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}