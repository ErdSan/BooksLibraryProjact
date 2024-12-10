package org.aston.homeworks;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable() == true) {
                book.displayInfo();
            }
        }
    }

    public Book findBooksByAuthor(String author) {
        Book foundBook = null;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBook = book;
            }
        }
        return foundBook;
    }
}
