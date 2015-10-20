import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String name;
    private String authorName;
    private Date publishDate;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy"); // Паттерн даты для книги

    public Book() { // Пустой конструктор
        this.publishDate = null;
        this.authorName = "";
        this.name = "";
    }

    public Book(String name, String authorName, int publishDate) throws ParseException { // Конструктор
        this.name = name;
        this.authorName = authorName;
        this.publishDate = simpleDateFormat.parse(String.valueOf(publishDate)); // Парсинг года из int в Date
    }

    public int compareTo(Book anotherBook) { // compareTo для книг
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
