package org.aston.homeworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Класс библиотеки
 */
public class Library {
    private Set<Book> books = new LinkedHashSet<>();

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Книги, которые уже есть:\n" + book.getTitle());
            System.out.println("**************************************************");
        }
        else {
            books.add(book);
        }
    }

    public void printAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
