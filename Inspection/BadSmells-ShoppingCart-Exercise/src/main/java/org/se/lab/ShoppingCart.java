package org.se.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart
{
	private int id;
	private List<Article> articles = new ArrayList<>();

	public ShoppingCart(int id) {
		this.id = id;
	}

	public void addArticle(Article a) {
		articles.add(a);
	}

	public String toString()
	{
		String s = "Cart: " + id + "\n";
		for(Iterator it = articles.iterator(); it.hasNext();)
		{
			Article a = (Article)it.next();
			s += a.toString();
		}		
		return s;
	}

	
	public String toXml()
	{
		String xml = "<shoppingcart id=\"" + id + "\">\n";
		for(Iterator it = articles.iterator(); it.hasNext();)
		{
			Article a = (Article)it.next();
			xml += a.toXml();
		}				
		xml += "</shoppingcart>";
		return xml;
	}
}
