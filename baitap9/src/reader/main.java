/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reader;


import book.Main;
import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        sevice s=new sevice();

        while (true) {
            System.out.println("1. Manage Books");
            System.out.println("2. Manage Readers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("quanlysach");
                    Main m=new Main();
                    break;
                case 2:
                    System.out.println("1. Add reader");
                    System.out.println("2. Remove reader");
                    System.out.println("3. Find reader by ID");
                    System.out.println("4. Display all readers");
                    System.out.println("5. Go back to main menu");
                    System.out.print("Choose an option: ");
                    int readerChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    switch (readerChoice) {
                        case 1:
                            s.add();
                            break;
                        case 2:
                            s.bookidremove();
                            break;
                        case 3:
                            s.bookidupdate();
                            break;
                        case 4:
                            s.getall();
                            break;
                        case 5:
                            System.out.println("Going back to main menu.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
