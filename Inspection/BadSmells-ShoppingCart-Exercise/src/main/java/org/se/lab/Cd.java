package org.se.lab;

public class Cd extends Article {
    public Cd(int id, String description, double price) {
        super(id, description, price);
    }

    @Override
    protected String getTypeName() {
        return "CD";
    }
}
