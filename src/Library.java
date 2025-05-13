import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBooks(Book book) {
        this.books.add(book);
    }

    public void deleteBook(Book book) {
        this.books.remove(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }

}
