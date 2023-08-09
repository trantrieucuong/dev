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
public class sevice {
    Scanner scanner=new Scanner(System.in);
    Library library=new Library();
    public void add(){
        System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book topic: ");
                    String topic = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    Book newBook = new Book(id, name, topic, author, quantity);
                    library.addBook(newBook);
    }
    public void bookidremove(){
        System.out.print("Enter book ID to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
    }
    public void bookidupdate(){
        System.out.print("Enter book ID to find: ");
                    int findId = scanner.nextInt();
                    Book foundBook = library.findBookById(findId);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
    }
    public  void getall(){
        System.out.println("All books:");
                    library.displayBooks();
    }
}
