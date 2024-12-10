package org.aston.homeworks;

public class Main {
    private static Library library = new Library();

    public static void main( String[] args ) {
        Book book1 = new Book("Философия java", "Эккель", 2022, false);
        Book book2 = new Book("Алгоритмы", "Лафоре", 2022, true);
        Book book3 = new Book("Сказ о рыбаке и рыбке", "Пушкин");
        Book book4 = new Book("Мартин Иден", "Лондон");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.printAvailableBooks();
        book1.returnBook();
        book2.borrowBook();
        library.printAvailableBooks();
        library.findBooksByAuthor("Пушкин").displayInfo();
    }
}
