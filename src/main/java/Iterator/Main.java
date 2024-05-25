package Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Great Gatsby"));
        bookCollection.addBook(new Book("Hounds of Baskerville"));
        bookCollection.addBook(new Book("To Kill a Mockingbird"));

        Iterator<Book> iterator = bookCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
