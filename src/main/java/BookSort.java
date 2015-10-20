import java.util.List;

public class BookSort {
    public static void sort(List<Book> books) { // Метод сортировки книг пузырьком, старые первые
        if (books.size() > 1) {
            for (int i = 0; i < books.size(); i++) {
                for (int j = 0; j < books.size() - 1 - i; j++) {
                    if (books.get(j).compareTo(books.get(j + 1)) > 0) {
                        swapBooks(books, j);
                    }
                }
            }
        }
    }

    private static void swapBooks(List<Book> books, int i) { // Метод для обмена книг
        Book tmp = books.get(i);
        books.set(i, books.get(i + 1));
        books.set(i + 1, tmp);
    }
}
