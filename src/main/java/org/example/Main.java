package org.example;

import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user=new User("utkarsh","1");
        Book book=new Book("lifeOfAnEngineer","jwhwhdu83e","utkarshGahoi");
        LibraryRecks libraryRecks=new LibraryRecks();
        libraryRecks.assignBookToFirstAvailableReck(book);
       // BookManagementSystem bookManagementSystem=new BookManagementSystem();
        BookManagementSystem bookManagementSystem = BookManagementSystem.borrowBook(user, book, user.getName(), user.id, "2011/8/15", "2021/8/15");
        Map<User, List<Book>> allBooking = BookManagementSystem.getAllBooking();
        for (Map.Entry<User,List<Book>> entry : allBooking.entrySet())
            System.out.println("Key = " + entry.getKey().getName() +
                    ", Value = " + entry.getValue());

    }
    }
