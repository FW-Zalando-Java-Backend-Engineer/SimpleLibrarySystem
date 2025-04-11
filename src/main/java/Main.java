import com.example.library.Book;
import com.example.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        library.addBook(book1);
        library.addBook(book2);

        library.listBooks();

        library.removeBook(book1);
        library.listBooks();
    }
}
