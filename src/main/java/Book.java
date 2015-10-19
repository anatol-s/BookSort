import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Book {
    private String name;
    private String authorName;
    private Date publishDate;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

    public Book(String name, String authorName, int publishDate) throws ParseException {
        this.name = name;
        this.authorName = authorName;
        this.publishDate = simpleDateFormat.parse(String.valueOf(publishDate));
    }

    public static void sort(List<Book> books) {
        if (books.size() > 1) {
            for (int i = 0; i < books.size(); i++) {
                for (int j = 0; j < books.size() - 1 - i; j++) {
                    if (books.get(j).compareTo(books.get(j + 1)) == 1) {
                        swapBooks(books, j);
                    }
                }
            }
        }
    }

    private static void swapBooks(List<Book> books, int i) {
        Book tmp = books.get(i);
        books.set(i, books.get(i + 1));
        books.set(i + 1, tmp);
    }

    public int compareTo(Book anotherBook) {
        int compareDate = publishDate.compareTo(anotherBook.publishDate);
        int compareName = name.compareTo(anotherBook.name);
        int compareAuthor = authorName.compareTo(anotherBook.authorName);
        if (compareDate != 0) {
            return compareDate;
        } else if (compareName != 0) {
            return compareName;
        } else return compareAuthor;
    }

    @Override
    public String toString() {
        return name + " " + authorName + " - " + simpleDateFormat.format(publishDate) + ".";
    }
}
