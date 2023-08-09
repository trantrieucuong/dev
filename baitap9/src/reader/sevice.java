/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reader;

import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class sevice {
    Scanner scanner=new Scanner(System.in);
    ReaderManager readerManager=new ReaderManager();
    public void add(){
        System.out.print("Enter reader ID: ");
                            int readerId = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline
                            System.out.print("Enter reader name: ");
                            String readerName = scanner.nextLine();
                            System.out.print("Enter phone number: ");
                            String phoneNumber = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            Reader newReader = new Reader(readerId, readerName, phoneNumber, address);
                            readerManager.addReader(newReader);
    }
    public void bookidremove(){
        System.out.print("Enter reader ID to remove: ");
                            int removeReaderId = scanner.nextInt();
                            readerManager.removeReader(removeReaderId);
                            
    }
    public void bookidupdate(){
        System.out.print("Enter reader ID to find: ");
                            int findReaderId = scanner.nextInt();
                            Reader foundReader = readerManager.findReaderById(findReaderId);
                            if (foundReader != null) {
                                System.out.println("Reader found:");
                                System.out.println(foundReader);
                            } else {
                                System.out.println("Reader not found.");
                            }
    }
    public  void getall(){
        System.out.println("All readers:");
                            readerManager.displayReaders();
    }
}
