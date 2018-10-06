package org.se.lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.se.lab.Article;
import org.se.lab.ShoppingCart;



public class ShoppingCartTest
{
	private ShoppingCart cart;
	
	@Before
	public void setup()
	{
		cart = new ShoppingCart();
		
		Article cd = new Article(1, Article.Type.CD, "Rolling Stones", 12.99	);
		cart.articles.add(cd);
		
		Article book = new Article(7, Article.Type.BOOK, "Refactoring", 57.80);
		book.setAuthor("Martin Fowler");
		cart.articles.add(book);
		
		Article dvd = new Article(13, Article.Type.DVD, "ACDC Live", 24.90);
		cart.articles.add(dvd);		
	}
	

	@Test
	public void testToString()
	{
		String s = cart.toString();		
	
		final String EXPECTED = 
				"Cart: 0\n" +
				"CD:	1	Rolling Stones	12.99\n" +
				"BOOK:	7	Refactoring	Martin Fowler	57.8\n" +
				"DVD:	13	ACDC Live	24.9\n";

		Assert.assertEquals(EXPECTED, s);
	}

	@Test
	public void testToXml()
	{
		String s = cart.toXml();		
		
		final String EXPECTED = 
				"<shoppingcart id=\"0\">\n" +
				"	<cd id=\"1\" description=\"Rolling Stones\" price=\"12.99\"/>\n" +
				"	<book id=\"7\" description=\"Refactoring\" price=\"57.8\" author=\"Martin Fowler\"/>\n" +
				"	<dvd id=\"13\" description=\"ACDC Live\" price=\"24.9\"/>\n" +
				"</shoppingcart>";
		
		Assert.assertEquals(EXPECTED, s);
	}
}
