package org.se.lab;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart
{
	private final int id;
	private final List<Article> articles = new ArrayList<>();

	public ShoppingCart(int id) {
		this.id = id;
	}

	public void addArticle(Article a) {
		articles.add(a);
	}

	public String toString()
	{
		final StringBuilder s = new StringBuilder("Cart: " + id + "\n");
		articles.forEach(a -> s.append(a.toString()));
		return s.toString();
	}

	
	public String toXml()
	{
		final StringBuilder xml = new StringBuilder("<shoppingcart id=\"" + id + "\">\n");
		articles.forEach(a -> xml.append(a.toXml()));
		return xml.append("</shoppingcart>").toString();
	}
}
