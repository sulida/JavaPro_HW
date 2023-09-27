package practice270923;

import java.util.ArrayList;
import java.util.HashSet;

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

    }
}
