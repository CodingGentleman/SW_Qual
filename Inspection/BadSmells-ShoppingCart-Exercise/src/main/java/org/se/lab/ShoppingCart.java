package org.se.lab;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart
{
	/*
	 * Property: id
	 */
	public int id;
	
	/*
	 * Property: articles
	 */
	public ArrayList articles = new ArrayList();

	
	public String toString()
	{
		String s = "Cart: " + id + "\n";
		for(Iterator it = articles.iterator(); it.hasNext();)
		{
			Article a = (Article)it.next();	
			switch(a.getType())
			{
				case BOOK:
					// TODO: refactor to avoid cast
					s += "BOOK:\t" + a.getId() + "\t" + a.getDescription() + "\t" + ((Book)a).getAuthor() + "\t" + a.getPrice() + "\n";
				break;
				
				case CD:
					s += "CD:\t" + a.getId() + "\t" + a.getDescription() + "\t" + a.getPrice() + "\n";
				break;
				
				case DVD:
					s += "DVD:\t" + a.getId() + "\t" + a.getDescription() + "\t" + a.getPrice() + "\n";
				break;
			}
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
