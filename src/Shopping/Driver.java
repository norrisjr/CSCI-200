package Shopping;

import java.text.NumberFormat;
//import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//creating a customer with attributes
		Customer customer1 = new Customer("Steve", "Jobs", "123 Test St.");
		System.out.println(customer1 + "\n");
		
		//creating a customer with attributes manually
		Customer customer2 = new Customer(null, null, null);
		customer2.setFirstName("Bill");
		customer2.setLastName("Gates");
		customer2.setMailingAddress("321 Microsoft St");
		
		//retrieving the attributes manually
		System.out.println(customer2.getFirstName() + " " + customer2.getLastName());
		System.out.println(customer2.getMailingAddress() + "\n");
		
		//creating three items
		Item item1 = new Item("apple", "red delicious", 0.78);
		Item item2 = new Item("grapes","seedless", 2.50);
		Item item3 = new Item(null, null, 0);
		item3.setName("pear");
		item3.setDescription("yellow");
		item3.setPrice(0.25);
		
		//printing out the three items
		System.out.println(item1 + "\n");
		System.out.println(item2 + "\n");
		System.out.println(item3.getName());
		System.out.println(item3.getDescription());
		NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
		System.out.println(priceFormat.format(item3.getPrice()) + "\n");
		
		
		//working with the shopping cart object
		customer1.getCart().addItem(item1);
		customer1.getCart().addItem(item2);
		customer1.getCart().addItem(item3);
		//totaling cart
		@SuppressWarnings("deprecation")
		Double total = new Double(customer1.getCart().calculateTotal());
		System.out.println("Cart Total is " + priceFormat.format(total) + "\n");
		//displaying the cart
		System.out.println("Cart contains ");
		System.out.println(customer1.getCart());
		//removing an item and verifying removal
		customer1.getCart().removeItem(item2);
		System.out.println("Cart contains after deleting an item 2");
		System.out.println(customer1.getCart());
		//adding the item back and testing the removing all function
		customer1.getCart().addItem(item2);
		System.out.println("Cart contains after readdition of item 2");
		System.out.println(customer1.getCart());
		customer1.getCart().flushCart();
		System.out.println("Cart contains after flush ");
		System.out.println(customer1.getCart());
	}
}
