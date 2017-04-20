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
public class MultiItemSale
{
	private Sale[] sales;
	private int count;

	public MultiItemSale()
	{
		sales = new Sale[100];
		count = 0;
	}

	public MultiItemSale(int maxSize)
	{
		sales = new Sale[maxSize];
		count = 0;
	}

	public void addSale(Sale sale)
	{
		if(count < sales.length)
		{
			sales[count] = sale;
			count++;
		}
	}

	public Sale getSale(int index)
	{
		if(index < 0 || index >= count)
			return null;

		return sales[index];
	}

	public double getTotalBill()
	{
		double total = 0;

		for(int i = 0; i < count; i++)
		{
			total = total + sales[i].bill();
		}

		return total;
	}

	public String toString()
	{
		String result = "";

		for(int i = 0; i < count; i++)
		{
			result = result + sales[i] + "\n";
		}

		result = result + "\n" + "Total bill = $"
				+ String.format("%.2f", getTotalBill());

		return result;
	}
}