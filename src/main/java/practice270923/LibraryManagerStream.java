package practice270923;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LibraryManagerStream {
    private List<Book> libraryCatalog;
    private List<LibraryUser> libraryUsers;

    public LibraryManagerStream(List<Book> libraryCatalog, List<LibraryUser> libraryUsers) {
        this.libraryCatalog = libraryCatalog;
        this.libraryUsers = libraryUsers;
    }

    public LibraryManagerStream() {
    }

    // Переписанный метод с использованием стримов
    public List<Book> listAvailableBooksByGenre(String genre) {
        return libraryCatalog.stream()
                .filter(book -> book.isBookAvailable() && book.getBookGenre().equals(genre))
                .collect(Collectors.toList());
    }

    // Переписанный метод с использованием стримов
    public Set<String> listUserEmailsWithReservedBooks() {
        return libraryUsers.stream()
                .flatMap(user -> user.getUserBooksReserved().stream())
                .map(Book::getBookTitle)
                .collect(Collectors.toSet());
    }

    public void addBookToLibrary(Book book) {
        libraryCatalog.add(book);
    }

    public void removeBookFromLibrary(Book book) {
        libraryCatalog.remove(book);
    }

    public void borrowBook(LibraryUser user, Book book) {
        if (book.isBookAvailable()) {
            user.getUserBooksBorrowed().add(book);
            book.setBookAvailable(false);
        }
    }

    public void reserveBook(LibraryUser user, Book book) {
        if (book.isBookAvailable()) {
            user.getUserBooksReserved().add(book);
        }
    }
}