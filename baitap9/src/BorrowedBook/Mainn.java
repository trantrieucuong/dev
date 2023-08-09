/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BorrowedBook;

import book.Library;
import book.Main;
import book.sevice;
import java.text.ParseException;
import java.util.Scanner;
import reader.ReaderManager;
import reader.main;

/**
 *
 * @author Legion 5
 */
public class Mainn {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        ReaderManager readerManager = new ReaderManager();
        BorrowManager borrowManager = new BorrowManager();
        sevece s=new sevece();

        while (true) {
            System.out.println("1. Manage Books");
            System.out.println("2. Manage Readers");
            System.out.println("3. Manage Borrow and Return");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    Main m=new Main();
                    break;
                case 2:
                    main z=new main();
                    break;
                case 3:
                    System.out.println("1. Borrow book");
                    System.out.println("2. Return book");
                    System.out.println("3. Display borrowed books");
                    System.out.println("4. Go back to main menu");
                    System.out.print("Choose an option: ");
                    int borrowChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    switch (borrowChoice) {
                        case 1:
                            s.Borrow();
                            break;
                        case 2:
                            s.Return();
                                break;
                            
                        case 3:
                            s.Display();
                            break;
                        case 4:
                            System.out.println("Going back to main menu.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
