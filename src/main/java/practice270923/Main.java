package practice270923;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "The India Story", "Bimal Jalal", "Roman", 2022, true);
        Book book2 = new Book(2, "Romeo and Juliet, ", "William Shakespeare", "Poetry", 1916, true);
        Book book3 = new Book(3, " Hercule Poirot", "Agatha Christie", "Detective", 1949, true);
        Book book4 = new Book(4, " Maigret", "Georges Simenon", "Detective", 1950, true);


        LibraryUser user1 = new LibraryUser(1, "John Smith", "js@gmail.com", "+476758493",
                new ArrayList<>(), new HashSet<>());
        LibraryUser user2 = new LibraryUser(2, "Klide White", "kw@gmail.com", "+471230987",
                new ArrayList<>(), new HashSet<>());



        LibraryManagerStream libraryManager = new LibraryManagerStream();

        libraryManager.addBookToLibrary(book1);
        libraryManager.addBookToLibrary(book2);
        libraryManager.addBookToLibrary(book3);
        libraryManager.addBookToLibrary(book4);

        // Пользователь берет книгу в аренду
        libraryManager.borrowBook(user1, book1);

        // Пользователь резервирует книгу
        libraryManager.reserveBook(user2, book2);

        // Список доступных книг определенного жанра
        List<Book> availableBooksByGenre = libraryManager.listAvailableBooksByGenre("Roman");
        System.out.println("Available books with genre Roman:");
        for (Book book : availableBooksByGenre) {
            System.out.println(book.getBookTitle());
        }

        // Email пользователей, зарезервировавших книги
        Set<String> userEmailsWithReservedBooks = libraryManager.listUserEmailsWithReservedBooks();
        System.out.println("User emails with reserved books:");
        for (String userEmail : userEmailsWithReservedBooks) {
            System.out.println(userEmail);
        }
    }
}
