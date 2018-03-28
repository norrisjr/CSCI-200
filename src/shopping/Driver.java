package shopping;

import java.util.Scanner;
import java.text.NumberFormat;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userChoice = 1;
		//creating a customer for the user to interact with the shopping cart
		Customer customer = new Customer("USC_Upstate", "Student", "  Spartanburg, SC");
		//creating items to demo the software
		Item apple = new Item("apple", "  red delicious", 0.78);
		Item grapes = new Item("grapes","  seedless", 2.50);
		Item bowl = new Item("bowl", "  small, blue", 3.15);
		Item spoon = new Item("spoon", "  metal", .25);
		Item phone = new Item("phone", "  celluar", .15);
		Item orange = new Item("orange", "  fresh", 1.00);
		/**this while loop runs until the user quits, this will allow the user to add, remove,
		 * and clear the cart.
		 */
		while (userChoice != 0) {
			System.out.println("What would you like to do?");
			System.out.println("Enter 1 for view profile.");
			System.out.println("Enter 2 view the available items, and choose which to add to cart.");
			System.out.println("Enter 3 to remove an item from your cart.");
			System.out.println("Enter 4 to view your cart.");
			System.out.println("Enter 5 to empty your cart.");
			System.out.println("Enter 0 to quit the program.");
			userChoice = scan.nextInt();			
			/**switch statement that handles the input from user, goes into the add, 
			 * remove, and clear options
			 */
			switch (userChoice) {
				case 1:	
					//calls the customer object and prints the attributes
					System.out.println(customer + "\n"); 
					break;
				case 2: 
					/**displays the items and asks the user for input on what to add
					 * calls the addItem method from the ShoppingCart object and stores them 
					 * in a linked array
					 */
					System.out.println("Available Items:\n");
					System.out.println(apple + "\n\n" + grapes + "\n\n" + bowl + "\n"); 
					System.out.println(spoon + "\n\n" + phone + "\n\n" + orange);			
					System.out.println("Which would like like to add?");
					System.out.print("1:apple 2:grapes 3:bowl 4:spoon 5:phone 6:orange");
					userChoice = scan.nextInt();
					switch (userChoice) {
						case 1:
							customer.getCart().addItem(apple);
							System.out.println("Apple added to cart\n");
							break;
						case 2:
							customer.getCart().addItem(grapes);								
							System.out.println("Grapes added to cart\n");
							break;
						case 3:
							customer.getCart().addItem(bowl);
							System.out.println("Bowl added to cart\n");
							break;
						case 4:
							customer.getCart().addItem(spoon);
							System.out.println("Spoon added to cart\n");
							break;
						case 5:
							customer.getCart().addItem(phone);
							System.out.println("Phone added to cart\n");
							break;
						case 6:
							customer.getCart().addItem(orange);
							System.out.println("Orange added to cart\n");
							break;
					}
					break;
				case 3:
					/**asks the user what they want to remove from the cart,
					 * this calls the removeItem method from the ShoppingCart object
					 */
					System.out.println("What do you want to remove?");
					System.out.print("1:apple 2:grapes 3:bowl 4:spoon 5:phone 6:orange");
					userChoice = scan.nextInt();
					switch (userChoice) {
						case 1:
							customer.getCart().removeItem(apple);
							System.out.println("Apple removed from cart\n");
							break;
						case 2:
							customer.getCart().removeItem(grapes);								
							System.out.println("Grapes removed from cart\n");
							break;
						case 3:
							customer.getCart().removeItem(bowl);
							System.out.println("Bowl removed from cart\n");
							break;
						case 4:
							customer.getCart().removeItem(spoon);
							System.out.println("Spoon removed from cart\n");
							break;
						case 5:
							customer.getCart().removeItem(phone);
							System.out.println("Phone removed from cart\n");
							break;
						case 6:
							customer.getCart().removeItem(orange);
							System.out.println("Orange removed from cart\n");
							break;
					} 
					break;
				case 4:
					//calls the toString method from ShoppingCart to print the current cart
					System.out.println("Your cart contains:\n");
					System.out.println(customer.getCart() + "\n");
					break;
				case 5:
					//calls the flushCart method from ShoppingCart to clear the customers cart
					customer.getCart().flushCart();
					System.out.println("Cart emptied\n");
					break;
			}
		}
		scan.close();
		/** ************************************************************************
		 * **************************************************************************
		 * This section tests the individual methods in each of the Customer, Item, 
		 * and ShoppingCart objects
		 */
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
		System.out.println("Cart contains after the addition of item 2");
		System.out.println(customer1.getCart());
		customer1.getCart().flushCart();
		System.out.println("Cart contains after flush ");
		System.out.println(customer1.getCart());
	}
}
