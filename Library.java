package lab_7;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getNumber(), book);
    }

    public Book searchByNumber(int number) {
        return books.get(number);
    }

    public void issueBook(int number) {
        Book book = searchByNumber(number);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book Issued: " + book.getName());
        } else {
            System.out.println("Book not available for issue.");
        }
    }

    public void returnBook(int number) {
        Book book = searchByNumber(number);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            System.out.println("Book Returned: " + book.getName());
        } else {
            System.out.println("This book is not issued.");
        }
    }
}

