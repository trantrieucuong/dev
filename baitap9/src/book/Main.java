/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sevice sv=new sevice();
        

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Find book by ID");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    sv.add();
                    break;
                case 2:
                    
                    sv.bookidremove();
                    break;
                case 3:
                    
                    sv.bookidupdate();
                    break;
                case 4:
                    sv.getall();
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
