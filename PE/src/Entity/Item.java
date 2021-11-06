package Entity;

public class Item
{
	private String name;
	private int price;

	public Item(String name) {
		this.name = name;
	}

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void outputItem() {
		System.out.println(this);
	}

	public void inputItem() {

	}

	public String toString() {
		return String.format("%s - %d", 
			this.name, this.price);
	}
}