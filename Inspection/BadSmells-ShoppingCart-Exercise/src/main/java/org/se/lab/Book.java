package org.se.lab;

public class Book extends Article {
    private String author;

    public Book(int id, Type type, String description, String author, double price) {
        super(id, type, description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
