package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Aggregate<Book> {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}
