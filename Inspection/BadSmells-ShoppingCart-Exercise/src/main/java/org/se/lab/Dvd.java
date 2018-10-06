package org.se.lab;

public class Dvd extends Article {
    public Dvd(int id, Type type, String description, double price) {
        super(id, type, description, price);
    }

    @Override
    protected String getTypeName() {
        return "DVD";
    }
}
