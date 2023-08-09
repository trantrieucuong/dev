/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BorrowedBook;

import book.Book;
import book.Library;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import reader.Reader;
import reader.ReaderManager;

/**
 *
 * @author Legion 5
 */
public class sevece {
    Scanner scanner=new Scanner(System.in);
    ReaderManager readerManager=new ReaderManager();
    Library library=new Library();
    BorrowManager borrowManager=new BorrowManager();
    public  void Borrow() throws ParseException{
         System.out.print("Enter reader ID: ");
                            int borrowerId = scanner.nextInt();
                            Reader borrower = readerManager.findReaderById(borrowerId);
                            if (borrower == null) {
                                System.out.println("Reader not found.");
                                
                            }
                            System.out.print("Enter book ID: ");
                            int borrowedBookId = scanner.nextInt();
                            Book borrowedBook = library.findBookById(borrowedBookId);
                            if (borrowedBook == null) {
                                System.out.println("Book not found.");
                               
                            }
                            System.out.print("Enter borrow date (yyyy-MM-dd): ");
                            String borrowDateStr = scanner.next();
                            Date borrowDate = new SimpleDateFormat("yyyy-MM-dd").parse(borrowDateStr);
                            System.out.print("Enter return date (yyyy-MM-dd): ");
                            String returnDateStr = scanner.next();
                            Date returnDate = new SimpleDateFormat("yyyy-MM-dd").parse(returnDateStr);
                            borrowManager.createBorrow(borrower, borrowedBook, borrowDate, returnDate);
    }   
    public void Return(){
        System.out.print("Enter reader ID: ");
                            int returnerId = scanner.nextInt();
                            Reader returner = readerManager.findReaderById(returnerId);
                            if (returner == null) {
                                System.out.println("Reader not found.");
                                
                            }
                            System.out.print("Enter book ID: ");
                            int returnedBookId = scanner.nextInt();
                            Book returnedBook = library.findBookById(returnedBookId);
                            if (returnedBook == null) {
                                System.out.println("Book not found.");
                                
                            }
                            borrowManager.returnBook(returner, returnedBook);
    }
    public  void Display(){
        System.out.println("Borrowed books:");
                            borrowManager.displayBorrowedBooks();
    }
}
    
