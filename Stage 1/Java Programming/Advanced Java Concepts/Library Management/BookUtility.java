import java.util.ArrayList;
import java.util.List;

public class BookUtility implements Runnable {

    private List<Book> bookList = new ArrayList<>();
    private String searchbookName;
    private int counter;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getSearchbookName() {
        return searchbookName;
    }

    public void setSearchbookName(String searchbookName) {
        this.searchbookName = searchbookName;
    }

    public int getCounter() {
        return counter;
    }

    public void toValidateBookType(Book obj) throws InvalidBookException {
        if (!obj.getBookType().equalsIgnoreCase("engineering")) {
            throw new InvalidBookException("Book type Invalid");
        }
        bookList.add(obj);
    }

    @Override
    public void run() {
        counter = 0;
        for (Book book : bookList) {
            if (book.getBookName().equalsIgnoreCase(searchbookName)) {
                counter++;
            }
        }
    }
}
