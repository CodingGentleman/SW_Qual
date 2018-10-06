package org.se.lab;

public abstract class Article
{
	enum Type {BOOK, CD, DVD};

	private int id;

	private Type type;

	private String description;

	private double price;

	public Article(int id, Type type, String description, double price) {
		this.id = id;
		this.type = type;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public Type getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
}
