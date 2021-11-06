package GUI;

import Entity.*;
import MyLib.*;

import java.io.FileNotFoundException;

public class Store
{
	public static void main(String[] args) throws FileNotFoundException {
		String[] options = {"Create an order", "Add an item to the shopping cart", 
			"Display the order", "Others, exit the program"};
		int userchoice;
		Order order = null;
		ItemList itemlist = new ItemList();
		char check = 'Y';
		itemlist.loadItem("itemlist.txt");
		do {
			System.out.println("Item list: ");
			itemlist.displayItems();
			userchoice = MyLib.MenuManager.getUserChoice(options);
			if(userchoice == 1) order = new Order();
			else if(userchoice == 2) {
				String itemName = Inputter.nextNonEmptyString("Input an item's name, you want to buy: ");
				if(order != null) {
					check = Inputter.nextChar("Continue (Y:yes / N:no)?");
					if(check == 'Y') {
						order.addItemToCart(itemName, itemlist);
					} else {
						System.out.println("Canceled");
					}
				}	
				else 
					System.out.println("Order has not initialized yet\nPlease create an order\n");
			} else if(userchoice == 3) {
				order.displayOrder();
			} else {
				System.out.println("Bye!");
				break;
			}
			System.out.print("\n\n");
		} while(true);
	}
}