/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program15;

/**
 *
 * @author janellejlo
 */
public class PizzaOrderDemo {
    public static void main(String[] args)
	{
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
		Pizza pizza2 = new Pizza("medium", 2, 2, 0);
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		double total = order.calcTotal();
		
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		System.out.println("Total cost: $" + total);
	}
}
