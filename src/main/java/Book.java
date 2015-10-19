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
                    int compareDate = books.get(j).publishDate.compareTo(books.get(j + 1).publishDate);
                    int compareName = books.get(j).name.compareTo(books.get(j + 1).name);
                    int compareAuthor = books.get(j).authorName.compareTo(books.get(j + 1).authorName);
                    if (compareDate == 1) {
                        swapBooks(books, j);
                    } else if (compareDate == 0 && compareName == 1) {
                        swapBooks(books, j);
                    } else if (compareDate == 0 && compareAuthor == 1) {
                        swapBooks(books, j);
                    }
                    System.out.println(compareDate);
                }
            }
        }
    }

    private static void swapBooks(List<Book> books, int i) {
        Book tmp = books.get(i);
        books.set(i, books.get(i + 1));
        books.set(i + 1, tmp);
    }

    @Override
    public String toString() {
        // Вывод по правилам списка использованой литературы.
        return authorName + " - " + name + " - " + simpleDateFormat.format(publishDate);
    }
}
