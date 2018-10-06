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

    @Override
    protected String getTypeName() {
        return "BOOK";
    }

    @Override
    public String toString() {
        return getTypeName()+":\t"+getId() + "\t" + getDescription() + "\t" + getAuthor() + "\t" + getPrice() + "\n";
    }
}
