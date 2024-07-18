import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        List<Book> bookList = new ArrayList<>();
        BookUtility bookUtility = new BookUtility();
        bookUtility.setBookList(bookList);

        System.out.println("Enter the number of entries");
        int numberOfEntries = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the bookId/bookName/bookType/bookCategory/bookEdition");
        for (int i = 0; i < numberOfEntries; i++) {
            
            String[] bookDetails = sc.nextLine().split("/");
            Book book = new Book(bookDetails[0], bookDetails[1], bookDetails[2], bookDetails[3], bookDetails[4]);
            try {
                bookUtility.toValidateBookType(book);
            } catch (InvalidBookException e) {
                System.out.println(e.getMessage());
                sc.close();
                return;
            }
        }

        System.out.println("Print the book details");
        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("Enter book name to search");
        String searchBookName = sc.nextLine();
        bookUtility.setSearchbookName(searchBookName);

        Thread bookSearchThread = new Thread(bookUtility);
        bookSearchThread.start();

        try {
            bookSearchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int count = bookUtility.getCounter();
        if (count > 0) {
            System.out.println("Count of books in the library with the book name " + searchBookName.toUpperCase() + " is " + count);
        } else {
            System.out.println("no books found");
        }

        sc.close();
    }
}
