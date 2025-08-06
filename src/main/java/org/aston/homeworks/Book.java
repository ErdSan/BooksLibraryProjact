package org.aston.homeworks;

import java.util.Objects;

/**
 * Класс книги коммент2 новый
 */
public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean isAvailable;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable)
            this.isAvailable = false;
    }

    public void returnBook() {
        if (!isAvailable)
            this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Автор - " + this.author);
        System.out.println("Название книги - " + this.title);
        System.out.println("Год издания - " + this.year);
        System.out.println("**************************************************");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isAvailable == book.isAvailable && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, isAvailable);
    }
}
