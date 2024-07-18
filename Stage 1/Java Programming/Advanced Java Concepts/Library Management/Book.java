public class Book {
    private String bookId;
    private String bookName;
    private String bookType;
    private String bookCategory;
    private String bookEdition;

    public Book(){
        super();
    }
    public Book(String bookId, String bookName, String bookType, String bookCategory, String bookEdition) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookType = bookType;
        this.bookCategory = bookCategory;
        this.bookEdition = bookEdition;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    @Override
    public String toString() {
        return "bookId=" + bookId + ", bookName=" + bookName + ", bookType=" + bookType;
    }
}
