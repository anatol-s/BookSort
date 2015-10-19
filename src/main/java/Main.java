import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Book> books = new LinkedList<Book>();
        books.add(new Book("Java 8. Полное руководство, Девятое издание.", "Герберт Шилдт", 2015));
        books.add(new Book("Java 8. Полное руководство, Девятое издание.", "Герберт Шилдт", 2014));
        books.add(new Book("Java 7. Руководство для начинающих, Пятое издание.", "Герберт Шилдт", 2015));
        books.add(new Book("Java 8. Карманный справочник.", "Роберт Лигуори, Патриция Лигуори", 2015));
        books.add(new Book("Философия Java. 4-е полное издание.", "Брюс Эккель", 2015));
        books.add(new Book("Java 8. Аолное руководство, Девятое издание.", "Герберт Шилдт", 2014));

        Book.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
