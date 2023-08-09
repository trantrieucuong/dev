/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author Legion 5
 */
public class Book {
    private int id;
    private String name;
    private String topic;
    private String author;
    private int quantity;

    public Book() {
    }
    

    public Book(int id, String name, String topic, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

   

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nTopic: " + topic +
               "\nAuthor: " + author + "\nQuantity: " + quantity;
    }
}
