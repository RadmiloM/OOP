import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private List<Book> books;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", books=" + books +
                '}';
    }

    public static void main(String[] args) {
        Book firstBook = new Book("Harry Potter", "Hari Poter i Kamen mudrosti", "123-444-333");
        Book secondBook = new Book("Harry Potter", "Hari Poter i Dvorana tajni", "11-32-22");
        Book thirdBook = new Book("Harry Potter", "Hari Poter i Zatvorenik iz Askabana", "11-32-22");
        firstBook.addBook(secondBook);
        firstBook.addBook(thirdBook);
        System.out.println("Before book removal");
        System.out.println(firstBook);
        firstBook.removeBook(secondBook);
        System.out.println("After book removal");
        System.out.println(firstBook);

    }

}
