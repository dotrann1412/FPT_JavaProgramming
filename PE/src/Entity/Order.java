package Entity;

public class Order
{
	private String customerName;
	private String phone;
	ItemList shoppingCart;

	public Order() {
		this.customerName = "khach le";
		this.phone = "123456";
		this.shoppingCart = new ItemList();
	}

	public Order(String name, String phone) {
		this.customerName = name;
		this.phone = phone;
	}

	public String getName() {
		return this.customerName;
	}

	public String getPhoneNumber() {
		return this.phone;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public void setPhoneNumber(String phone) {
		this.phone = phone;
	}

	public boolean addItemToCart(String itemName, ItemList itemlist) {
		Item item = itemlist.findItem(itemName);
		if(item != null) {
			shoppingCart.addItem(item);
			itemlist.removeItem(itemName);
			System.out.println("The shopping cart:");
			shoppingCart.displayItems();
			return true;
		} 
		System.out.format("Not found Item with name %s\n", itemName);
		return false;
	}

	public void displayOrder() {
		System.out.println("Your order:");
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Phone: " + phone);
		System.out.println("Shopping Cart: ");
		this.shoppingCart.displayItems();
		System.out.print("Total: " + this.shoppingCart.getTotalPrice());
	}
}