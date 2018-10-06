package org.se.lab;

public class Dvd extends Article {
    public Dvd(int id, String description, double price) {
        super(id, description, price);
    }

    @Override
    protected String getTypeName() {
        return "DVD";
    }
}
