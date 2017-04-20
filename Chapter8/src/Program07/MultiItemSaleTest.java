/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program07;

/**
 *
 * @author janellejlo
 */
public class MultiItemSaleTest
{
	public static void main(String[] args)
	{
		Sale sale1 = new Sale("Atomic coffee mug", 111.00);
		Sale sale2 = new Sale("Cup holder", 11.90);
		Sale sale3 = new Sale("Tire gauge", 8.80);

		DiscountSale discSale1 = 
				new DiscountSale("Invisible paint", 6.50, 12);
		DiscountSale discSale2 = 
				new DiscountSale("Floor mat", 10.90, 10);
		DiscountSale discSale3 = new DiscountSale("Paint", 13, 9);
		DiscountSale discSale4 = new DiscountSale("Map", 7.95, 0);

		MultiItemSale multiSales = new MultiItemSale();

		multiSales.addSale(sale1);
		multiSales.addSale(sale2);
		multiSales.addSale(sale3);
		multiSales.addSale(discSale1);
		multiSales.addSale(discSale2);
		multiSales.addSale(discSale3);
		multiSales.addSale(discSale4);

		System.out.println(multiSales);
	}
}