package Entity;

import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;

import java.util.ArrayList;

public class ItemList
{
	private ArrayList<Item> arr = null;

	public ItemList() {
		arr = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		arr.add(item);
	}


	public void loadItem(String filename) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filename));
		while(scanner.hasNextLine()) {
			String itemRawStr = scanner.nextLine();
			String[] itemStr = itemRawStr.split("-");
			arr.add(new Item(itemStr[0].trim(), Integer.parseInt(itemStr[1].trim())));
		}
		System.out.println("Item has been loaded from " + filename);
	}

	public void removeItem(String name) {
		Item item = findItem(name);
		if(item == null) System.out.format("Item with name %s has not existed\n", name);
		else {
			this.arr.remove(item);
		}
	}
	
	public int getTotalPrice() {
		int res = 0;
		for(Item item: arr) res += item.getPrice();
		return res;
	}

	public void displayItems() {
		int total = 0;
		for(int i = 0; i < this.arr.size(); ++i) {
			System.out.format("%d %s\n", i + 1, arr.get(i).toString());
			
		}
		System.out.println("Total quantity: " + arr.size());
	}

	public Item findItem(String name) {
		for(Item item: arr) {
			if(item.getName().equals(name.trim())) 
				return item;
		}
		return null;
	}
}