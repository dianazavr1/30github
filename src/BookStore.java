import java.util.HashMap;
import java.util.Map;

public class BookStore {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();
        books.put("Гарри Поттер", new Book("Гарри Поттер", 500, "Дж. Роулинг"));
        books.put("Война и мир", new Book("Война и мир", 1000, "Л. Толстой"));
        books.put("1984", new Book("1984", 600, "Дж. Оруэлл"));

        printEntrySet(books);
        printKeySet(books);
        printValues(books);
    }

    static void printEntrySet(Map<String, Book> books) {
        System.out.println("Пары ключ-значение:");
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static void printKeySet(Map<String, Book> books) {
        System.out.println("\nИмена книг:");
        for (String name : books.keySet()) {
            System.out.println(name);
        }
    }

    static void printValues(Map<String, Book> books) {
        System.out.println("\nОбъекты книг:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
}
