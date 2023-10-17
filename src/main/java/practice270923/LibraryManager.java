//package practice270923;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class LibraryManager {
//    private List<Book> libraryCatalog;
//    private List<LibraryUser> libraryUsers;
//
//    public LibraryManager(List<Book> libraryCatalog, List<LibraryUser> libraryUsers) {
//        this.libraryCatalog = libraryCatalog;
//        this.libraryUsers = libraryUsers;
//    }
//    public LibraryManager(){
//
//    }
//
//    public List<Book> listAvailableBooksByGenre(String genre) {
//        List<Book> listAvailableBooksByGenre = new ArrayList<>();
//        for (Book book : libraryCatalog) {
//            if (book.isBookAvailable() && book.getBookGenre().equals(genre)) {
//                listAvailableBooksByGenre.add(book);
//            }
//        }
//        return listAvailableBooksByGenre;
//    }
//    public Set<String> listUserEmailsWithReservedBooks() {
//        Set<String> userEmailsWithReservedBooks = new HashSet<>();
//        for (LibraryUser user : libraryUsers) {
//            for (Book book : user.getUserBooksReserved()) {
//                userEmailsWithReservedBooks.add(user.getUserEmail());
//            }
//        }
//        return userEmailsWithReservedBooks;
//    }
//    public void addBookToLibrary(Book book) {
//        libraryCatalog.add(book);
//    }
//    public void removeBookFromLibrary(Book book) {
//        libraryCatalog.remove(book);
//    }
//    public void borrowBook(LibraryUser user, Book book) {
//        if (book.isBookAvailable()) {
//                        user.getUserBooksBorrowed().add(book);
//
//            book.setBookAvailable(false);
//        }
//
//    }
//    public void reserveBook(LibraryUser user, Book book) {
//        if (book.isBookAvailable()) {
//            user.getUserBooksReserved().add(book);
//        }
//    }
//}
