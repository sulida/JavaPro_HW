package practice270923;

import java.util.List;
import java.util.Set;

public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private List<Book> userBooksBorrowed;
    private Set<Book> userBooksReserved;

    public LibraryUser(int userId, String userName, String userEmail, String userPhone, List<Book> userBooksBorrowed, Set<Book> userBooksReserved) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userBooksBorrowed = userBooksBorrowed;
        this.userBooksReserved = userBooksReserved;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public List<Book> getUserBooksBorrowed() {
        return userBooksBorrowed;
    }

    public void setUserBooksBorrowed(List<Book> userBooksBorrowed) {
        this.userBooksBorrowed = userBooksBorrowed;
    }

    public Set<Book> getUserBooksReserved() {
        return userBooksReserved;
    }

    public void setUserBooksReserved(Set<Book> userBooksReserved) {
        this.userBooksReserved = userBooksReserved;
    }
}
