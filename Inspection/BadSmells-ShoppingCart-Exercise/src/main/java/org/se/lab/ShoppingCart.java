package org.se.lab;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart
{
	private int id;
	private ArrayList articles = new ArrayList();

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
			switch(a.getType())
			{
				case BOOK:
					xml += "\t<book id=\"" + a.getId() + "\" description=\"" + a.getDescription()
							+ "\" price=\"" + a.getPrice()
							+ "\" author=\"" + ((Book)a).getAuthor() + "\"/>\n";
				break;
				
				case CD:
					xml += "\t<cd id=\"" + a.getId() + "\" description=\"" + a.getDescription()
						+ "\" price=\"" + a.getPrice() + "\"/>\n";
				break;
				
				case DVD:
					xml += "\t<dvd id=\"" + a.getId() + "\" description=\"" + a.getDescription()
					+ "\" price=\"" + a.getPrice() + "\"/>\n";
				break;
			}
		}				
		xml += "</shoppingcart>";
		return xml;
	}
}
