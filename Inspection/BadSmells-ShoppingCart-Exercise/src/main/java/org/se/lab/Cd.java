package org.se.lab;

public class Cd extends Article {
    public Cd(int id, Type type, String description, double price) {
        super(id, type, description, price);
    }

    @Override
    protected String getTypeName() {
        return "CD";
    }
}
