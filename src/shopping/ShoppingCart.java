package shopping;

import java.util.ArrayList;

public class ShoppingCart {	
	private ArrayList<Item> cart;
	
	public ShoppingCart() {
		cart  = new ArrayList<Item>();
	}
	
	//adds an item to cart
	public void addItem(Item name) {
		cart.add(name);
	}
	
	//deletes item from cart
	public void removeItem(Item name) {
		cart.remove(name);
	}
	
	//removes all items from cart
	public void flushCart() {
		cart.clear();
	}
	
	public int cartSize() {
		return cart.size();
	}
	
	//returns the total price of items in cart
	public double calculateTotal() {
		double total = 0;
		for (int i = 0; i < cart.size(); i++)
			total += cart.get(i).getPrice();
		return total;
	}
	
	//custom method to print the items in the cart
	public String toString() {
		for (int i = 0; i < cart.size(); i++)
			System.out.println(cart.get(i).getName() + " " + cart.get(i).getDescription() 
					+ " " + cart.get(i).getPrice());
		return " ";
	}
		
}
