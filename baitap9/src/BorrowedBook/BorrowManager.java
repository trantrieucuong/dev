/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BorrowedBook;

import book.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import reader.Reader;

/**
 *
 * @author Legion 5
 */
public class BorrowManager {
    public List<BorrowedBook> borrowedBooks;

    public BorrowManager() {
        borrowedBooks = new ArrayList<>();
    }

    public void createBorrow(Reader reader, Book book, Date borrowDate, Date returnDate) {
        BorrowedBook borrowedBook = new BorrowedBook(reader, book, borrowDate, returnDate);
        borrowedBooks.add(borrowedBook);
    }

    public void returnBook(Reader reader, Book book) {
        borrowedBooks.removeIf(borrowedBook -> 
            borrowedBook.getReader().getId() == reader.getId() && 
            borrowedBook.getBook().getId() == book.getId());
    }

    public void displayBorrowedBooks() {
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.println(borrowedBook);
            System.out.println("-------------------------------");
        }
    }
}
