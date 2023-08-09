/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BorrowedBook;

import book.Book;
import java.util.Date;
import reader.Reader;

/**
 *
 * @author Legion 5
 */
public class BorrowedBook {
    private Reader reader;
    private Book book;
    private Date borrowDate;
    private Date returnDate;

    public BorrowedBook() {
    }
    
    public BorrowedBook(Reader reader, Book book, Date borrowDate, Date returnDate) {
        this.reader = reader;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    

    @Override
    public String toString() {
        return "Borrower: " + reader.getName() + "\nBook: " + book.getName() +
               "\nBorrow Date: " + borrowDate + "\nReturn Date: " + returnDate;
    }
}
