package shopping;

public class Customer {
	private String firstName;
	private String lastName;
	private String mailingAddress;
	private ShoppingCart cart;
	
	public Customer (String firstName, String lastName, String mailingAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailingAddress = mailingAddress;
		this.cart = new ShoppingCart();
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mailingAddress
	 */
	public String getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param mailingAddress the mailingAddress to set
	 */
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	/**
	 * @return the cart
	 */
	public ShoppingCart getCart() {		
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	/**
	 * Prints out a formatted version of the Customer
	 */
	public String toString() {
		return (firstName + " " + lastName + "\n" + mailingAddress);
	}
}
