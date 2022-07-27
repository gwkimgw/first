package objecttest;

class Book{
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + "," + author;
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Book book = new Book("Java", "author");
        System.out.println(book);

        String str = new String("test");
        System.out.println(str);
    }
}
