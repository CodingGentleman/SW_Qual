package org.se.lab;

public class Article
{
	enum Type {BOOK, CD, DVD};

	public int id;

	public Type type;
	
	public String description;

	public String author;	// Temporary Field
	
	public double price;
}
