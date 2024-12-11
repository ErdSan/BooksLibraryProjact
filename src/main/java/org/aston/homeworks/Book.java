package org.aston.homeworks;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private boolean isAvailable = true;

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
    }

    public void borrowBook() {
        if (this.isAvailable == true)
            this.isAvailable = false;
    }

    public void returnBook() {
        if (this.isAvailable == false)
            this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Автор - " + this.author);
        System.out.println("Название книги - " + this.title);
        System.out.println("Год издания - " + this.year);
        System.out.println("**************************************************");
    }
}
