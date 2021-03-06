import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        start();
    }

    private static void start() throws ParseException {
        List<Book> books = new LinkedList<Book>();
        books.add(new Book("Java 8. Полное руководство, 9-е издание.", "Герберт Шилдт.", 2015));
        books.add(new Book("Java 7. Руководство для начинающих, 5-е издание.", "Герберт Шилдт.", 2015));
        books.add(new Book("Java 8. Карманный справочник.", "Роберт Лигуори, Патриция Лигуори.", 2015));
        books.add(new Book("Философия Java. 4-е полное издание.", "Брюс Эккель.", 2015));
        books.add(new Book("Java. Методы программирования.", "Игорь Блинов, Валерий Романчик.", 2013));

        BookSort.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
