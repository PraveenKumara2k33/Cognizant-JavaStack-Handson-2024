import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BookStoreUtility {
    private List<Book> bookList;

    public BookStoreUtility() {
        this.bookList = new ArrayList<>();
    }

    public BookStoreUtility(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book bookObj) {
        bookList.add(bookObj);
    }

    public int calculateTotalPurchaseCost(Stream<Book> bookStream) {
        return bookStream.mapToInt(Book::getPrice).sum();
    }
}
